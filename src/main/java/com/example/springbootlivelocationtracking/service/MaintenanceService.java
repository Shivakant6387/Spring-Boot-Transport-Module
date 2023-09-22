package com.example.springbootlivelocationtracking.service;

import com.example.springbootlivelocationtracking.dto.MaintenanceRecordDTO;
import com.example.springbootlivelocationtracking.exception.ResourceNotFoundException;
import com.example.springbootlivelocationtracking.model.MaintenanceRecord;
import com.example.springbootlivelocationtracking.reository.MaintenanceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MaintenanceService {
    @Autowired
    private MaintenanceRecordRepository maintenanceRecordRepository;

    public List<MaintenanceRecord> getAllMaintenanceRecords() {
        return maintenanceRecordRepository.findAll();
    }

    public MaintenanceRecord getMaintenanceRecordById(Long id) {
        Optional<MaintenanceRecord> optionalRecord = maintenanceRecordRepository.findById(id);
        if (optionalRecord.isPresent()) {
            return optionalRecord.get();
        } else {
            throw new ResourceNotFoundException("Maintenance Record not found with id: " + id);
        }
    }

    public MaintenanceRecordDTO createMaintenanceRecord(MaintenanceRecordDTO maintenanceRecordDTO) {
        try {
            MaintenanceRecord maintenanceRecord = new MaintenanceRecord();
            maintenanceRecord.setVehicleId(maintenanceRecordDTO.getVehicleId());
            maintenanceRecord.setMaintenanceDate(maintenanceRecordDTO.getMaintenanceDate());
            maintenanceRecord.setDescription(maintenanceRecordDTO.getDescription());
            maintenanceRecord.setCost(maintenanceRecordDTO.getCost());
            maintenanceRecord.setMaintenanceType(maintenanceRecordDTO.getMaintenanceType());
            maintenanceRecord.setMileage(maintenanceRecordDTO.getMileage());
            maintenanceRecord.setMechanic(maintenanceRecordDTO.getMechanic());
            maintenanceRecord.setNotes(maintenanceRecordDTO.getNotes());
            maintenanceRecord.setScheduled(maintenanceRecordDTO.isScheduled());
            MaintenanceRecord savedMaintenanceRecord = maintenanceRecordRepository.save(maintenanceRecord);
            return convertToDTO(savedMaintenanceRecord);
        } catch (Exception ex) {
            throw new ResourceNotFoundException("Maintenance Record is not created" + ex.getMessage());
        }
    }

    private MaintenanceRecordDTO convertToDTO(MaintenanceRecord maintenanceRecord) {
        MaintenanceRecordDTO maintenanceRecordDTO = new MaintenanceRecordDTO();
        maintenanceRecordDTO.setId(maintenanceRecord.getId());
        maintenanceRecordDTO.setVehicleId(maintenanceRecord.getVehicleId());
        maintenanceRecordDTO.setMaintenanceDate(maintenanceRecord.getMaintenanceDate());
        maintenanceRecordDTO.setDescription(maintenanceRecord.getDescription());
        maintenanceRecordDTO.setCost(maintenanceRecord.getCost());
        maintenanceRecordDTO.setMaintenanceType(maintenanceRecord.getMaintenanceType());
        maintenanceRecordDTO.setMileage(maintenanceRecord.getMileage());
        maintenanceRecordDTO.setMechanic(maintenanceRecord.getMechanic());
        maintenanceRecordDTO.setNotes(maintenanceRecord.getNotes());
        maintenanceRecordDTO.setScheduled(maintenanceRecord.isScheduled());
        return maintenanceRecordDTO;
    }

    public MaintenanceRecordDTO updateMaintenanceRecord(Long id, MaintenanceRecordDTO maintenanceRecordDTO) {
        // Check if the record exists by its ID
        Optional<MaintenanceRecord> optionalRecord = maintenanceRecordRepository.findById(id);

        if (optionalRecord.isPresent()) {
            // Get the existing record
            MaintenanceRecord existingRecord = optionalRecord.get();

            // Update the existing record with data from MaintenanceRecordDTO
            existingRecord.setMaintenanceDate(maintenanceRecordDTO.getMaintenanceDate());
            existingRecord.setDescription(maintenanceRecordDTO.getDescription());
            existingRecord.setCost(maintenanceRecordDTO.getCost());
            existingRecord.setMaintenanceType(maintenanceRecordDTO.getMaintenanceType());
            existingRecord.setMileage(maintenanceRecordDTO.getMileage());
            existingRecord.setMechanic(maintenanceRecordDTO.getMechanic());
            existingRecord.setNotes(maintenanceRecordDTO.getNotes());
            existingRecord.setScheduled(maintenanceRecordDTO.isScheduled());

            // Save the updated record
            MaintenanceRecord updatedRecord = maintenanceRecordRepository.save(existingRecord);

            // Convert and return the updated record as a DTO
            return convertToDTO(updatedRecord);
        } else {
            // If the record does not exist, you can choose to throw an exception or handle it differently
            throw new ResourceNotFoundException("Maintenance Record not found with id: " + id);
        }
    }

    public void deleteMaintenanceRecord(Long id) {
        Optional<MaintenanceRecord> optionalRecord = maintenanceRecordRepository.findById(id);
        if (optionalRecord.isPresent()) {
            maintenanceRecordRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Maintenance Record not found with id: " + id);
        }
    }

    public List<MaintenanceRecordDTO> getMaintenanceRecordsByVehicle(int vehicleId) {
        List<MaintenanceRecord> maintenanceRecords = maintenanceRecordRepository.findByVehicleId(vehicleId);
        return convertToDTOList(maintenanceRecords);
    }

    private List<MaintenanceRecordDTO> convertToDTOList(List<MaintenanceRecord> maintenanceRecords) {
        return maintenanceRecords.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    public List<MaintenanceRecordDTO> getMaintenanceRecordsByMechanic(String mechanicName) {
        List<MaintenanceRecord> maintenanceRecords = maintenanceRecordRepository.findByMechanic(mechanicName);
        return convertToDTOList(maintenanceRecords);
    }


    public MaintenanceRecordDTO getLatestMaintenanceRecordByVehicle(int vehicleId) {
        MaintenanceRecord latestRecord = maintenanceRecordRepository.findTopByVehicleIdOrderByMaintenanceDateDesc(vehicleId);

        if (latestRecord != null) {
            return convertToDTO(latestRecord);
        } else {
            throw new ResourceNotFoundException("No maintenance record found for vehicle with id: " + vehicleId);
        }
    }

}
