package com.revolution.common.event;

public record PaymentEvent(
        long orderId,
        long receiverId
        int status
) {
}
