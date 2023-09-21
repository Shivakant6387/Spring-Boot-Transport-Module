package com.example.springbootlivelocationtracking.exception;

public class LocationUpdateException extends RuntimeException{
    public LocationUpdateException(String message){
        super(message);
    }
}
