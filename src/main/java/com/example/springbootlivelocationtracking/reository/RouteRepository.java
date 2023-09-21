package com.example.springbootlivelocationtracking.reository;

import com.example.springbootlivelocationtracking.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}
