package com.example.springbootlivelocationtracking.service;

import com.example.springbootlivelocationtracking.reository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepository;

}
