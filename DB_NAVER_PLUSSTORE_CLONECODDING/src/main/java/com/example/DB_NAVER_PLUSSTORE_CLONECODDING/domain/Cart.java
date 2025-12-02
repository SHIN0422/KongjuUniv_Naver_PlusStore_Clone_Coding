package com.example.DB_NAVER_PLUSSTORE_CLONECODDING.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cart")
@Getter
@NoArgsConstructor
public class Cart {

    @EmbeddedId
    private CartId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("customerId")
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("optionId")
    @JoinColumn(name = "option_id")
    private ProductOption option;

    @Column(nullable = false)
    private int quantity;
}
