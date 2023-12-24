package com.enigma.pos.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_product_price")
@Builder(toBuilder = true)
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "stock", columnDefinition = "int check (stock > 0)")
    private Integer stock;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "price", columnDefinition = "bigint check (price > 0)")
    private Long price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonBackReference
    private Product product;
}
