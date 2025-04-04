package com.revolution.common.response;

import java.util.List;

public record OrderResponse(
        long orderId,
        long receiverId,
        List<LineItemResponse> items
) {
}
