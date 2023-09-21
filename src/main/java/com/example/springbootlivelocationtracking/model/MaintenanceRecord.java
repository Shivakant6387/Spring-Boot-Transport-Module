package com.example.springbootlivelocationtracking.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MaintenanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Date maintenanceDate;
    @NotNull
    private String description;
    @NotNull
    private double cost;
    @NotNull
    private String maintenanceType;
    @NotNull
    private int mileage;
    @NotNull
    private String mechanic;
    @NotNull
    private String notes;
    @NotNull
    private boolean isScheduled;
    @NotNull
    private int vehicleId;

}
