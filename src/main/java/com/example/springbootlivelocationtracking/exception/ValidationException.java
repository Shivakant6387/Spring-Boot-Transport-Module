package com.example.springbootlivelocationtracking.exception;

public class ValidationException extends RuntimeException{
    ValidationException (String message){
        super(message);
    }
}
