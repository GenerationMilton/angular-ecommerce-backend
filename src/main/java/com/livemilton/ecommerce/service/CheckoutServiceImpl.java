package com.livemilton.ecommerce.service;

import com.livemilton.ecommerce.dao.CustomerRepository;
import com.livemilton.ecommerce.dto.Purchase;
import com.livemilton.ecommerce.dto.PurchaseResponse;
import com.livemilton.ecommerce.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;
    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        //retrieve the order info from dto
        Order order = purchase.getOrder();

        //generate tracking number
        String orderTrackingNumber= generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        //populate order with orderItems

        //populate order with orderItems

        //populate order with billingAddress

        //populate customer with order

        //save to the database

        //return a response

        return null;

    }

    private String generateOrderTrackingNumber() {

        //generate a random UUID number(UUID version-4)
        //For details see: https://en.wikipedia.org/wiki/Universally_unique_identifier
        return null;
    }


}
