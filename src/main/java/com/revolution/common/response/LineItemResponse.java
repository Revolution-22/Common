package com.revolution.common.response;

import java.math.BigDecimal;

public record LineItemResponse(
        String name,
        BigDecimal price
) {
}
