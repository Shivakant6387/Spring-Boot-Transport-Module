package com.example.springbootlivelocationtracking.reository;

import com.example.springbootlivelocationtracking.model.StaffTransportDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffTransportDetailsRepository extends JpaRepository<StaffTransportDetails, Long> {
}
