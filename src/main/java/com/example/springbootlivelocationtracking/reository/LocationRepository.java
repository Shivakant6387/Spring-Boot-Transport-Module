package com.example.springbootlivelocationtracking.reository;

import com.example.springbootlivelocationtracking.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
}
