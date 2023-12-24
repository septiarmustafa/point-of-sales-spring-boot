package com.enigma.pos.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "m_cashier")
@Builder(toBuilder = true)
public class Cashier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",  nullable = false, length = 50)
    private String name;

    @Column(name = "phone",  nullable = false, length = 14)
    private String phone;

    @OneToOne
    @JoinColumn (name = "user_credential_id")
    private UserCredential userCredential;
}
