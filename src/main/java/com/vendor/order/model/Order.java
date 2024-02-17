
package com.vendor.order.model;

import java.util.UUID;

import com.vendor.order.enums.OrderStatus;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class Order {
    private UUID id;
    private UUID userId;
    private List<OrderItem> orderItems;
    private List<UUID> packageIds;
    private OrderStatus status;
    private DeliveryDetail deliveryDetail;
    private BigDecimal totalAmount;
}
