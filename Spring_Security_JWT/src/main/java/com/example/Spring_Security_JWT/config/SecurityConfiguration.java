package com.example.Spring_Security_JWT.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfiguration {

    @Bean  // authentication
    public UserDetailsService userDetailsService(){                //PasswordEncoder encoder
//        UserDetails admin = User.withUsername("suraj")
//                .password(encoder.encode("root"))
//                .roles("ADMIN")
//                .build();                                         //This is the basic approach without DB
//        UserDetails user = User.withUsername("rahul")
//                .password(encoder.encode("root"))
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(admin,user);

        return new UserInfoDetialsService();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
          return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {
    return httpSecurity.csrf().disable()
             .authorizeHttpRequests()
            .requestMatchers("/products/welcome","/products/new").permitAll()
             .requestMatchers("/products/admin","/products/error")
            .authenticated().and().formLogin().and().build();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider= new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

}
