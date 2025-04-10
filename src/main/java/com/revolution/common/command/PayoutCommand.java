package com.revolution.common.command;

import java.math.BigDecimal;

public record PayoutCommand(
        String bankAccountNumber,
        long orderId,
        long receiverId,
        BigDecimal amount
){
}
