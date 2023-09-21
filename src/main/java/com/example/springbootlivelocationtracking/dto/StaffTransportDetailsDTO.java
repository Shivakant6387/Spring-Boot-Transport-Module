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
public class StaffTransportDetailsDTO {
    private Long id;
    private Date transportDate;
    private String staffName;
    private String routeName;
    private String vehicleRegistrationNumber;
}
