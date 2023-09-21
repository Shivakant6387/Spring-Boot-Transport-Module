package com.example.springbootlivelocationtracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MaintenanceRecordDTO {
    private Long id;
    private int vehicleId;
    private Date maintenanceDate;
    private String description;
    private double cost;
    private String maintenanceType;
    private int mileage;
    private String mechanic;
    private String notes;
    private boolean isScheduled;

}
