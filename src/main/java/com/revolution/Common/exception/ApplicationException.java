package com.revolution.Common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;


public class ApplicationException extends RuntimeException {

    @Getter
    private HttpStatus status;

    public ApplicationException(String message, HttpStatus httpStatus) {
        super();
    }
}
