package com.example.springbootlivelocationtracking.exception;

public class LocationRetrievalException extends RuntimeException{
    public LocationRetrievalException(String message) {
        super(message);
    }
}
