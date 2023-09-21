package com.example.springbootlivelocationtracking.reository;

import com.example.springbootlivelocationtracking.model.VehicleFuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleFuelRepository extends JpaRepository<VehicleFuel,Long> {
}
