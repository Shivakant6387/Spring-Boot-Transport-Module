package com.example.springbootlivelocationtracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VehicleFuelDTO {
    private Long id;
    private Date refuelingDate;
    private String vehicleRegistrationNumber;
    private double fuelQuantity;
    private double fuelCost;
}
