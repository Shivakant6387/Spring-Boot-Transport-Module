package com.example.springbootlivelocationtracking.reository;

import com.example.springbootlivelocationtracking.model.MaintenanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MaintenanceRecordRepository extends JpaRepository<MaintenanceRecord, Long> {
    List<MaintenanceRecord> findByVehicleId(int vehicleId);

    List<MaintenanceRecord> findByMechanic(String mechanicName);

    MaintenanceRecord findTopByVehicleIdOrderByMaintenanceDateDesc(int vehicleId);

}
