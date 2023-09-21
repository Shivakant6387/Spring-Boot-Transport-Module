package com.example.springbootlivelocationtracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TransportFeeDTO {
    private Long id;
    private Date feeDate;
    private String name;
    private double feeAmount;
}
