package com.example.springbootlivelocationtracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteDTO {
    private Long id;
    private String name;
    private String origin;
    private String destination;
    private int numberOfStops;
    private double totalDistance;
    private int estimatedDuration;
}
