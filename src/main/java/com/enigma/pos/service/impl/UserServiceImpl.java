package com.enigma.pos.service.impl;

import com.enigma.pos.entity.AppUser;
import com.enigma.pos.entity.UserCredential;
import com.enigma.pos.repository.UserCredentialRepository;
import com.enigma.pos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserCredentialRepository userCredentialRepository;

    @Override
    public AppUser loadUserByUserId(String id) {
        UserCredential userCredential = userCredentialRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("Invalid credential"));
        return AppUser.builder()
                .id(userCredential.getId())
                .username(userCredential.getUsername())
                .password(userCredential.getPassword())
                .role(userCredential.getRole().getName())
                .build();
    }

    public UserDetails loadUserByUsername (String username) throws  UsernameNotFoundException {
        UserCredential userCredential = userCredentialRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Invalid credential"));
        return  AppUser.builder()
                .id(userCredential.getId())
                .username(userCredential.getUsername())
                .password(userCredential.getPassword())
                .role(userCredential.getRole().getName())
                .build();
    }
}
