package com.anirvan.replenisher.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Value("${com.anirvan.db.port}")
    private String port;

    @Value("${com.anirvan.db.user}")
    private String user;


    @Value("${com.anirvan.db.password}")
    private String password;

    @Value("${com.anirvan.db.db}")
    private String db;

    @Value("${com.anirvan.db.url}")
    private String url;

    @Bean
    public MongoClient mongoDbFactory() throws Exception {
        MongoCredential credential = MongoCredential.createCredential("", "", "".toCharArray());
        return new MongoClient(new MongoClientURI(new String()));

    }

}
