package com.example.springbootlivelocationtracking.service;

import com.example.springbootlivelocationtracking.dto.RouteDTO;
import com.example.springbootlivelocationtracking.reository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    @Autowired
    private  RouteRepository routeRepository;




//    public List<RouteDTO> getAllRoutes() {
//        // Implement logic to retrieve and convert routes to RouteDTOs
//    }
//
//    public RouteDTO getRouteById(Long id) {
//        // Implement logic to retrieve a route by ID and convert to RouteDTO
//    }
//
//    public RouteDTO createRoute(RouteDTO routeDTO) {
//        // Implement logic to create a new route from a RouteDTO
//    }
//
//    public RouteDTO updateRoute(Long id, RouteDTO routeDTO) {
//        // Implement logic to update an existing route by ID using data from RouteDTO
//    }
//
//    public void deleteRoute(Long id) {
//        // Implement logic to delete a route by ID
//    }
}
