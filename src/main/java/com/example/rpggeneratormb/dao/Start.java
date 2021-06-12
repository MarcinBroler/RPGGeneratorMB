package com.example.rpggeneratormb.dao;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Start {

    private UserRepo userRepo;

    public Start (UserRepo userRepo, PasswordEncoder passwordEncoder){
        this.userRepo = userRepo;

        User userAdmin = new User();
        userAdmin.setUsername("Marcin");
        userAdmin.setPassword(passwordEncoder.encode("Broler123"));
        userAdmin.setRole("ROLE_ADMIN");

        User userUser = new User();
        userUser.setUsername("Marys");
        userUser.setPassword(passwordEncoder.encode("Marys123"));
        userUser.setRole("ROLE_USER");


        userRepo.save(userAdmin);
        userRepo.save(userUser);

    }
}
