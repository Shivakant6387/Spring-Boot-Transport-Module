package com.example.springbootlivelocationtracking.reository;

import com.example.springbootlivelocationtracking.model.TransportFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportFeeRepository extends JpaRepository<TransportFee, Long> {
}
