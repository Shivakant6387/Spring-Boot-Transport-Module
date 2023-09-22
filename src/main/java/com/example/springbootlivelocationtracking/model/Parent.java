package com.example.springbootlivelocationtracking.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min = 2, message = "parent name should have at least 2 characters")
    private String ParentName;
    @NotEmpty
    @Size(min = 2, message = "first  name should have at least 2 characters")
    private String firstName;
    @NotEmpty
    @Size(min = 2, message = "last name should have at least 2 characters")
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;
    @NotNull
    private Date dateOfBirth;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private String state;
    @NotNull
    private String postalCode;
    @NotNull
    private String country;
    @NotNull
    private String role;
    @NotNull
    private boolean isActive;
    @NotNull
    private String emergencyContactName;
    @NotNull
    private String emergencyContactPhone;
    @NotNull
    private String vehicleLicensePlate;
}
