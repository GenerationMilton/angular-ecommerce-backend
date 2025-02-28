package com.livemilton.ecommerce.service;

import com.livemilton.ecommerce.dto.Purchase;
import com.livemilton.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
