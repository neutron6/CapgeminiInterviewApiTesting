package com.practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WrongInputException extends Exception {

    WrongInputException(String msg) {
        super("try todo ");
    }

}
