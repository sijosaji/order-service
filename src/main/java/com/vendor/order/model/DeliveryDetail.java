package com.vendor.order.model;

import lombok.Data;

@Data
public class DeliveryDetail {

 private String address;
 private String contactNumber;
 private String deliveryDate;
 private Location location;
 private String deliveryInstruction;
}
