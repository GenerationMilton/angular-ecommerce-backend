package com.livemilton.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name="order_item")
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="image_url")
    private String imageUrl;
    @Column(name="unit_price")
    private BigDecimal unitPrice;
    @Column(name="quantity")
    private int quantity;
    @Column(name="product_id")
    private Long productId;

    //reference to order
    private Order order;


}
