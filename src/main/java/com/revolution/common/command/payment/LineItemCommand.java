package com.revolution.common.command.payment;

import java.math.BigDecimal;

public record LineItemCommand(
        String name,
        BigDecimal price
) {
}
