package com.enigma.pos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_order")
@Builder(toBuilder = true)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",  nullable = false, length = 50)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "cashier_id")
    private Cashier cashierId;

}
