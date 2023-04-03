package com.example.Spring_Security_JWT.config;

import com.example.Spring_Security_JWT.entity.WatchMan;
import com.example.Spring_Security_JWT.repository.RepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserInfoDetialsService implements UserDetailsService {
    @Autowired
    private RepositoryClass repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
   Optional<WatchMan> userInfo = repository.findByName(username);


   return  userInfo.map(UserinfoUserDetails::new)
           .orElseThrow(()-> new UsernameNotFoundException("User not found"+ username));
    }
}
