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
public class ReportDTO {
    private Long id;
    private Date reportDate;
    private String reportType;
    private String content;
    private String author;
    private String vehicleRegistrationNumber;

}
