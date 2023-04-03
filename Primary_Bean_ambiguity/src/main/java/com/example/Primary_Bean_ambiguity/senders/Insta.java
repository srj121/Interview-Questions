package com.example.Primary_Bean_ambiguity.senders;

import com.example.Primary_Bean_ambiguity.interace_package.Remote;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
public class Insta implements Remote {
    public String publishPost(){
        return "Post Published from Insta";
    }

}
