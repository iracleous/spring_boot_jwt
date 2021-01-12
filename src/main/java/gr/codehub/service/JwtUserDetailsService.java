package gr.codehub.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
     private PasswordEncoder bCryptPasswordEncoder;

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        if ("frok".equals(username)) {
//            return new User("frok",  bCryptPasswordEncoder.encode("frik")
//        //            "$2a$10$nJBt88mf10z7gAzCI7Yz4OcawyvvtqFmtXEjx9aVsOe8xv..YuyUu"
//                    ,
//                    new ArrayList<>());
//        } else {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }

        return new User("frok",  bCryptPasswordEncoder.encode("frik"), new ArrayList<>());

    }
}