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
public class ParentDTO {
    private Long id;
    private String ParentName;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String role;
    private boolean isActive;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private String vehicleLicensePlate;
}
