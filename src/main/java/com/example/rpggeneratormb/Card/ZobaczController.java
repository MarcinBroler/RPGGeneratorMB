package com.example.rpggeneratormb.Card;

import com.example.rpggeneratormb.Card.Card;
import com.example.rpggeneratormb.Card.ICardsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ZobaczController {
    @Autowired
    ICardsRepository cardsRepository;

    //private static final Logger logger = LoggerFactory.getLogger(Card.class);

    @GetMapping(value = "/zobacz")
    public String getCards(Model model){
        model.addAttribute("cards", cardsRepository.findAll());
        return "zobacz";
    }

    @GetMapping(value = "/karta/{id}")
    public String getCardsData(@PathVariable("id") Long id, Model model){
        cardsRepository.findById(id).ifPresent(card -> model.addAttribute("card", card));
        return "result";
    }
}

