package com.revolution.common.exception;

import org.springframework.http.HttpStatus;

public record ErrorEntity(
        String message,
        int code,
        HttpStatus status) {
}
