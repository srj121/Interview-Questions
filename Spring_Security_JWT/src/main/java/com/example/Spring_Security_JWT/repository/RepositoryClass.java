package com.example.Spring_Security_JWT.repository;

import com.example.Spring_Security_JWT.entity.WatchMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RepositoryClass {
@Autowired
    MongoTemplate mongoTemplate;

    public Optional<WatchMan> findByName(String name){
        Criteria criteria = Criteria.where("name").is(name);
        Query query = new Query(criteria);
        return Optional.ofNullable(mongoTemplate.findOne(query, WatchMan.class));
    }


    public void addUser(WatchMan watchMan) {
        mongoTemplate.save(watchMan);
    }
}
