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
public class StaffTransportDTO {
    private Long id;
    private Date transportDate;
    private String staffName;
    private String department;
    private String routeName;
    private String vehicleRegistrationNumber;
}
