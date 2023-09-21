package com.example.springbootlivelocationtracking.service;

import com.example.springbootlivelocationtracking.reository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;
    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;

    }


//    public List<VehicleDTO> getAllVehicles() {
//        // Implement logic to retrieve and convert vehicles to VehicleDTOs
//    }
//
//    public VehicleDTO getVehicleById(Long id) {
//        // Implement logic to retrieve a vehicle by ID and convert to VehicleDTO
//    }
//
//    public VehicleDTO createVehicle(VehicleDTO vehicleDTO) {
//        // Implement logic to create a new vehicle from a VehicleDTO
//    }
//
//    public VehicleDTO updateVehicle(Long id, VehicleDTO vehicleDTO) {
//        // Implement logic to update an existing vehicle by ID using data from VehicleDTO
//    }
//
//    public void deleteVehicle(Long id) {
//        // Implement logic to delete a vehicle by ID
//    }
}
