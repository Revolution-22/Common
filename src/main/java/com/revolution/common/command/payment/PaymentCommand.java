package com.revolution.common.command.payment;

import java.util.List;

public record PaymentCommand(
        long orderId,
        long receiverId,
        List<LineItemCommand> items
) {
}
