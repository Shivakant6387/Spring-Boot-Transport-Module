package com.example.springbootlivelocationtracking.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LocationDTO {
    private Long id;
    private Double latitude;
    private Double longitude;
    private LocalDateTime timestamp;
}
