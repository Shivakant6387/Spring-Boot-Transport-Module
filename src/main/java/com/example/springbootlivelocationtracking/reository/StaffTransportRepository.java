package com.example.springbootlivelocationtracking.reository;

import com.example.springbootlivelocationtracking.model.StaffTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffTransportRepository extends JpaRepository<StaffTransport, Long> {
}
