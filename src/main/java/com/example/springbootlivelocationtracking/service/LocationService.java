package com.example.springbootlivelocationtracking.service;

import com.example.springbootlivelocationtracking.model.Location;
import com.example.springbootlivelocationtracking.reository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

}
