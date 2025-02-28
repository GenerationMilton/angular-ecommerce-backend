package com.livemilton.ecommerce.dto;

import com.livemilton.ecommerce.entity.Address;
import com.livemilton.ecommerce.entity.Customer;
import com.livemilton.ecommerce.entity.Order;
import com.livemilton.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
