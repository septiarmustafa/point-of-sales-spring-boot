package com.enigma.pos.entity;

import com.enigma.pos.constant.ERole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "m_role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Enumerated(EnumType.STRING)
    private ERole name;
}
