package com.example.Primary_Bean_ambiguity.controller;

import com.example.Primary_Bean_ambiguity.interace_package.Remote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Implementation {

    //    @Autowired
//    Remote remote;                             //if you don't set the bean to use it will give you
                                                //No Unique Bean Definition Exception
                                                //required a single bean, but 3 were found
//    @Qualifier("fb")                            //either you can use @Qualifier
    @Autowired                                  //or set a class a @Primary
            Remote remote;

    @GetMapping
    public  String servicemethod() {       //hit the api on the webpage
        System.out.println(remote.publishPost());
        return remote.publishPost();
    }

}
