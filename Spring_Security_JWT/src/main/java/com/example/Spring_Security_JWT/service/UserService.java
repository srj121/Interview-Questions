package com.example.Spring_Security_JWT.service;

import com.example.Spring_Security_JWT.entity.WatchMan;
import com.example.Spring_Security_JWT.repository.RepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    RepositoryClass repositoryClass;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addUser(WatchMan watchMan){
        watchMan.setPassword(passwordEncoder.encode(watchMan.getPassword()));
        repositoryClass.addUser(watchMan);
        return "user added to system";

    }

}
