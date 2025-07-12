package com.revolution.common.exception;

import org.springframework.http.HttpStatus;

public class NoAuthorityException extends RuntimeException {

    public NoAuthorityException(String role) {
        super("User dont have role " + role);
    }

    static ErrorEntity toErrorEntity(NoAuthorityException exception) {
        return new ErrorEntity(exception.getMessage(), 401, HttpStatus.UNAUTHORIZED);
    }
}
