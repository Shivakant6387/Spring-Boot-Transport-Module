package com.example.springbootlivelocationtracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VehicleDTO {
    private Long id;
    private String registrationNumber;
    private String make;
    private String model;
    private int year;
    private int seatingCapacity;
    private String vehicleType;
    private double fuelEfficiency;
    private String fuelType;
}
