package com.anirvan.replenisher.dao;

import com.anirvan.replenisher.model.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserDao {

    public User findByUsername(String username);
}
