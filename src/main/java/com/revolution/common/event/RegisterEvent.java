package com.revolution.common.event;

public record RegisterEvent(
        long userId,
        String username,
        String email
) {
}
