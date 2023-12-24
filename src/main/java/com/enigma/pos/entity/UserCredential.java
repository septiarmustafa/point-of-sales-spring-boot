package com.enigma.pos.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "m_user_credentials")
@Builder(toBuilder = true)
public class UserCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
