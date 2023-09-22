package com.example.springbootlivelocationtracking.controller;

import com.example.springbootlivelocationtracking.dto.ParentDTO;
import com.example.springbootlivelocationtracking.model.Parent;
import com.example.springbootlivelocationtracking.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/parents")
public class ParentController {
    @Autowired
    private ParentService parentService;

    @GetMapping("/welcome")
    public String message() {

        return "Welcome to my application";
    }

    @GetMapping("/getAllParent")
    public List<Parent> getAllParent() {
        return parentService.getAllParent();
    }
    @PostMapping("/createParent")
    public ResponseEntity<Parent> createParent(@RequestBody Parent parent) {
        Parent createdParent = parentService.createParent(parent);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdParent);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Parent> getParentById(@PathVariable Long id) {
        Parent parent = parentService.getParentById(id);
        if (parent == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(parent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Parent> updateParent(@PathVariable Long id, @RequestBody Parent updatedParent) {
        Parent parent = parentService.updateParent(id, updatedParent);
        if (parent == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(parent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParent(@PathVariable Long id) {
        parentService.deleteParent(id);
        return ResponseEntity.noContent().build();
    }
}
