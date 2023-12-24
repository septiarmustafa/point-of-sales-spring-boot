package com.enigma.pos.service;

import com.enigma.pos.entity.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    AppUser loadUserByUserId (String id);

}
