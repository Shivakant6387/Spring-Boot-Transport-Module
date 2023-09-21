package com.example.springbootlivelocationtracking.controller;

import com.example.springbootlivelocationtracking.dto.MaintenanceRecordDTO;
import com.example.springbootlivelocationtracking.model.MaintenanceRecord;
import com.example.springbootlivelocationtracking.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/maintenances")
public class MaintenanceController {
    @Autowired
    private MaintenanceService maintenanceService;

    @GetMapping("/maintenance")
    public String maintenance() {
        return "Welcome to my maintenance application";
    }

    @GetMapping("/getAllMaintenanceRecord")
    public ResponseEntity<List<MaintenanceRecord>> getAllMaintenanceRecords() {
        List<MaintenanceRecord> maintenanceRecords = maintenanceService.getAllMaintenanceRecords();
        return ResponseEntity.ok(maintenanceRecords);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaintenanceRecord> getMaintenanceRecordById(@PathVariable Long id) {
        MaintenanceRecord maintenanceRecord = maintenanceService.getMaintenanceRecordById(id);
        return ResponseEntity.ok(maintenanceRecord);
    }

    @PostMapping("/createMaintenanceRecord")
    public ResponseEntity<MaintenanceRecordDTO> createMaintenanceRecord(@RequestBody MaintenanceRecordDTO maintenanceRecordDTO) {
        MaintenanceRecordDTO createdRecord = maintenanceService.createMaintenanceRecord(maintenanceRecordDTO);
        return ResponseEntity.ok(createdRecord);
    }

    @DeleteMapping("/deleteMaintenanceRecord/{id}")
    public ResponseEntity<String> deleteMaintenanceRecord(@PathVariable Long id) {
        maintenanceService.deleteMaintenanceRecord(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("updateMaintenanceRecord/{id}")
    public ResponseEntity<MaintenanceRecordDTO> updateMaintenanceRecord(
            @PathVariable Long id,
            @RequestBody MaintenanceRecordDTO maintenanceRecordDTO
    ) {
        MaintenanceRecordDTO updatedRecord = maintenanceService.updateMaintenanceRecord(id, maintenanceRecordDTO);
        return ResponseEntity.ok(updatedRecord);
    }

    @GetMapping("/by-vehicle/{vehicleId}")
    public ResponseEntity<List<MaintenanceRecordDTO>> getMaintenanceRecordsByVehicle(@PathVariable int vehicleId) {
        List<MaintenanceRecordDTO> recordsByVehicle;
        recordsByVehicle = maintenanceService.getMaintenanceRecordsByVehicle(vehicleId);
        return ResponseEntity.ok(recordsByVehicle);
    }

    @GetMapping("/by-mechanic/{mechanicName}")
    public ResponseEntity<List<MaintenanceRecordDTO>> getMaintenanceRecordsByMechanic(@PathVariable String mechanicName) {
        List<MaintenanceRecordDTO> recordsByMechanic = maintenanceService.getMaintenanceRecordsByMechanic(mechanicName);
        return ResponseEntity.ok(recordsByMechanic);
    }


    @GetMapping("/latest-by-vehicle/{vehicleId}")
    public ResponseEntity<MaintenanceRecordDTO> getLatestMaintenanceRecordByVehicle(@PathVariable int vehicleId) {
        MaintenanceRecordDTO latestRecord = maintenanceService.getLatestMaintenanceRecordByVehicle(vehicleId);
        return ResponseEntity.ok(latestRecord);
    }
}
