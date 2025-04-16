package com.revolution.common.event;

import java.math.BigDecimal;

public record PayoutEvent(
        String bankAccountNumber,
        long orderId,
        long receiverId,
        BigDecimal amount
){
}
