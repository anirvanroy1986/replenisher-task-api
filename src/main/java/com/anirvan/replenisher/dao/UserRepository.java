package com.anirvan.replenisher.dao;

import com.anirvan.replenisher.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{ 'username' : ?0 }")
    public User findByUserName(String userName);
    @Query("{ 'firstName' : ?0 }")
    public User findByFirstName(String firstName);
}

