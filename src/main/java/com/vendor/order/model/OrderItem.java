package com.vendor.order.model;

import java.math.BigInteger;
import java.util.UUID;

import lombok.Data;

@Data
public class OrderItem {
    private UUID itemId;
    private BigInteger noOfPlates;
    
}
