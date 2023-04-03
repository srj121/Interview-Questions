package com.example.Spring_Security_JWT.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Setter
@Getter
    @Document("watchMan")
public class WatchMan {
    @Id
    private  String id;
    private String name;
    private String email;
    private String password;
    private String roles;



}
