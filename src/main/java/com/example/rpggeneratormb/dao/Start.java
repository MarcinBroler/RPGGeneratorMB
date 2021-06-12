package com.example.rpggeneratormb.dao;

import com.example.rpggeneratormb.dao.User;
import com.example.rpggeneratormb.dao.UserRepo;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Start {

    private UserRepo UserRepo;

    public Start (UserRepo userRepo, PasswordEncoder passwordEncoder){
        this.UserRepo = UserRepo;

        User user = new User();
        user.setUsername("Marcin");
        user.setPassword(passwordEncoder.encode("Broler123"));
        user.setRole("ROLE_ADMIN");
        userRepo.save(user);
    }
}
