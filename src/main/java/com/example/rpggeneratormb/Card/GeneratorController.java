package com.example.rpggeneratormb.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeneratorController {
    @Autowired
    ICardsRepository cardsRepository;
/*tu są wyświetlane wartości pierwotne karty */
    @GetMapping(value = "/generuj")
    public String getDataUser(Model model){
        Card card = new Card("Insert name", "Insert race",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        model.addAttribute("card", card);
        return "generuj";
    }
/*Tu się wyświetla podstrona z efektem zapisu */
    @PostMapping(value = "/generuj")
    public String getDataStats(@ModelAttribute Card card, ModelAndView model){
        model.addObject("card", card);
        cardsRepository.save(card);
        return "result";
    }

}
