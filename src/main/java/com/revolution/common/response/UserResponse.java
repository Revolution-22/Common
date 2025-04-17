package com.revolution.common.response;

import java.util.Set;

public record UserResponse(
        long userId,
        String email,
        Set<String> roles,
        String token,
        String refreshToken) {
}
