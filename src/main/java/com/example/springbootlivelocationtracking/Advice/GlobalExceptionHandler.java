package com.example.springbootlivelocationtracking.Advice;

import com.example.springbootlivelocationtracking.exception.LocationRetrievalException;
import com.example.springbootlivelocationtracking.exception.LocationUpdateException;
import com.example.springbootlivelocationtracking.exception.RegistrationException;
import com.example.springbootlivelocationtracking.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RegistrationException.class)
    public ResponseEntity<String> handleRegistrationException(RegistrationException ex) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed: " + ex.getMessage());
    }

    @ExceptionHandler(LocationUpdateException.class)
    public ResponseEntity<String> handleLocationUpdateException(LocationUpdateException ex) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Location update failed: " + ex.getMessage());
    }

    @ExceptionHandler(LocationRetrievalException.class)
    public ResponseEntity<String> handleLocationRetrievalException(LocationRetrievalException ex) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Location retrieval failed: " + ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error: " + ex.getMessage());
    }
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error: " + ex.getMessage());
    }
}
