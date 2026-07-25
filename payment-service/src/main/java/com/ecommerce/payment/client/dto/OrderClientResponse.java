package com.ecommerce.payment.client.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Lightweight DTO mirroring the order-service's OrderResponse fields
 * used by the payment-service Feign client.
 *
 * <p>Contains only the fields required by the payment-service to
 * validate the order and process payment.</p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderClientResponse {

    private UUID id;
    private String orderNumber;
    private UUID userId;
    private BigDecimal totalAmount;
    private String status;       // OrderStatus as string (e.g. "CREATED")
    private String paymentStatus; // PaymentStatus as string (e.g. "PENDING")
}
