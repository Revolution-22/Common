package com.revolution.Common.exception;

import org.springframework.http.HttpStatus;

public record ErrorEntity(
        String message,
        int code,
        HttpStatus status) {
}
