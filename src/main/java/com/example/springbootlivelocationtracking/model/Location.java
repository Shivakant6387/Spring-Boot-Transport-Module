package com.example.springbootlivelocationtracking.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
    @NotNull
    private LocalDateTime timestamp;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;
}
