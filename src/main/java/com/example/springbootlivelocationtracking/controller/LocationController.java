package com.example.springbootlivelocationtracking.controller;
import com.example.springbootlivelocationtracking.reository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {
    @Autowired
private LocationRepository locationRepository;
    @GetMapping("/location")
    public String location(){
        return "Welcome to my live location tracking application";
    }

//    @PostMapping
//    public ResponseEntity<Location> saveLocation(@RequestBody Location location) {
//        try {
//            Location savedLocation = locationService.saveLocation(location);
//            return new ResponseEntity<>(savedLocation, HttpStatus.CREATED);
//        } catch (LocationUpdateException ex) {
//            throw new LocationUpdateException("Location update failed: " + ex.getMessage());
//        }
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Location>> getAllLocations() {
//        List<Location> locations = locationService.getAllLocations();
//        return new ResponseEntity<>(locations, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Location> getLocationById(@PathVariable Long id) {
//        Location location = locationService.getLocationById(id);
//        if (location == null) {
//            throw new LocationRetrievalException("Location with id " + id + " not found");
//        }
//        return new ResponseEntity<>(location, HttpStatus.OK);
//    }
}
