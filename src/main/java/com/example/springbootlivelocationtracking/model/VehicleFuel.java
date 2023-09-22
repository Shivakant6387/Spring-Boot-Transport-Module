package com.example.springbootlivelocationtracking.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class VehicleFuel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Date refuelingDate;
    @NotNull
    private String vehicleRegistrationNumber;
    @NotNull
    private double fuelQuantity;
    @NotNull
    private double fuelCost;
}
