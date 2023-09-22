package com.example.springbootlivelocationtracking.service;

import com.example.springbootlivelocationtracking.dto.LocationDTO;
import com.example.springbootlivelocationtracking.exception.LocationNotFoundException;
import com.example.springbootlivelocationtracking.exception.LocationUpdateException;
import com.example.springbootlivelocationtracking.model.Location;
import com.example.springbootlivelocationtracking.model.Parent;
import com.example.springbootlivelocationtracking.reository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }
    public Location createLocation(LocationDTO locationDTO, Parent parent) {
        Location location = new Location();
        location.setLatitude(locationDTO.getLatitude());
        location.setLongitude(locationDTO.getLongitude());
        location.setTimestamp(locationDTO.getTimestamp());
        location.setParent(parent);
        return locationRepository.save(location);
    }

    public Location getLocationById(Long id) {
        return locationRepository.findById(id)
                .orElseThrow(() -> new LocationNotFoundException("Location not found with id: " + id));
    }
    public Location updateLocation(Long id, LocationDTO updatedLocationDTO) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new LocationUpdateException("Location not found with id: " + id));
        location.setLatitude(updatedLocationDTO.getLatitude());
        location.setLongitude(updatedLocationDTO.getLongitude());
        location.setTimestamp(updatedLocationDTO.getTimestamp());

        return locationRepository.save(location);
    }

    public void deleteLocation(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new LocationNotFoundException("Location not found with id: " + id));

        locationRepository.delete(location);
    }
}
