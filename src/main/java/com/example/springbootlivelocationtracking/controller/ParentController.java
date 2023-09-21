package com.example.springbootlivelocationtracking.controller;
import com.example.springbootlivelocationtracking.reository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parents")
public class ParentController {
    @Autowired
    private ParentRepository parentRepository;
    @GetMapping("/welcome")
    public String message(){
        return "Welcome to my application";
    }
}
