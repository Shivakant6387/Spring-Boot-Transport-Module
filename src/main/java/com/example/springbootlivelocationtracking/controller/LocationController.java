package com.example.springbootlivelocationtracking.controller;

import com.example.springbootlivelocationtracking.dto.LocationDTO;
import com.example.springbootlivelocationtracking.exception.LocationNotFoundException;
import com.example.springbootlivelocationtracking.exception.LocationUpdateException;
import com.example.springbootlivelocationtracking.model.Location;
import com.example.springbootlivelocationtracking.model.Parent;
import com.example.springbootlivelocationtracking.reository.ParentRepository;
import com.example.springbootlivelocationtracking.service.LocationService;
import com.example.springbootlivelocationtracking.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/locations")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @Autowired
    ParentRepository parentRepository;

    @GetMapping("/location")
    public String location() {
        return "Welcome to my live location tracking application";
    }

    @GetMapping("/getAllLocation")
    public List<Location> getAllLocation() {
        return locationService.getAllLocation();
    }

    @PostMapping("/createLocation")
    public ResponseEntity<Location> createLocation(@RequestBody LocationDTO locationDTO, @RequestParam Long parentId) {
        Optional<Parent> parentOptional = parentRepository.findById(parentId);
        if (!parentOptional.isPresent()) {
            return ResponseEntity.badRequest().build();
        }

        Parent parent = parentOptional.get();

        Location createdLocation = locationService.createLocation(locationDTO, parent);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLocation);
    }

    @GetMapping("/getByLocationId{id}")
    public ResponseEntity<Location> getLocationById(@PathVariable Long id) {
        try {
            Location location = locationService.getLocationById(id);
            return ResponseEntity.ok(location);
        } catch (LocationNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/updateLocation/{id}")
    public ResponseEntity<Location> updateLocation(@PathVariable Long id, @RequestBody LocationDTO updatedLocationDTO) {
        try {
            Location updatedLocation = locationService.updateLocation(id, updatedLocationDTO);
            return ResponseEntity.ok(updatedLocation);
        } catch (LocationUpdateException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteLocation/{id}")
    public ResponseEntity<Void> deleteLocation(@PathVariable Long id) {
        try {
            locationService.deleteLocation(id);
            return ResponseEntity.noContent().build();
        } catch (LocationNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
