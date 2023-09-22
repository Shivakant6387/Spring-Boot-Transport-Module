package com.example.springbootlivelocationtracking.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String registrationNumber;
    @NotNull
    private String make;
    @NotNull
    private String model;
    @NotNull
    private int year;
    @NotNull
    private int seatingCapacity;
    @NotNull
    private String vehicleType;
    @NotNull
    private double fuelEfficiency;
    @NotNull
    private String fuelType;
}
