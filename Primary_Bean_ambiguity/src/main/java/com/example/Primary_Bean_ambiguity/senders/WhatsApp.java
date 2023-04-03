package com.example.Primary_Bean_ambiguity.senders;

import com.example.Primary_Bean_ambiguity.interace_package.Remote;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class WhatsApp implements Remote {
    public String publishPost(){
        return "Post Published from WhatsApp";
    }


}
