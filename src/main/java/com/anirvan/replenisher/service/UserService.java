package com.anirvan.replenisher.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException;
}
