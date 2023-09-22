package com.example.springbootlivelocationtracking.service;

import com.example.springbootlivelocationtracking.dto.ParentDTO;
import com.example.springbootlivelocationtracking.exception.ParentNotFoundException;
import com.example.springbootlivelocationtracking.model.Parent;
import com.example.springbootlivelocationtracking.reository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepository;

    public List<Parent> getAllParent() {
        return parentRepository.findAll();
    }

    public Parent createParent(Parent parent) {
        // Add validation logic here
        if (isValidParent(parent)) {
            return parentRepository.save(parent);
        } else {
            throw new IllegalArgumentException("Invalid parent data");
        }
    }

    private boolean isValidParent(Parent parent) {
        if (parent.getParentName() != null && parent.getParentName().length() >= 2
                && parent.getFirstName() != null && parent.getFirstName().length() >= 2
                && parent.getLastName() != null && parent.getLastName().length() >= 2
        ) {
            return true;
        }
        return false;
    }

    public Parent getParentById(Long id) {
        Optional<Parent> parentOptional = parentRepository.findById(id);
        if (parentOptional.isPresent()) {
            return parentOptional.get();
        } else {
            throw new ParentNotFoundException("Parent not found with ID: " + id);
        }
    }

    public Parent updateParent(Long id, Parent updatedParent) {
        Optional<Parent> parentOptional = parentRepository.findById(id);
        if (parentOptional.isPresent()) {
            Parent existingParent = parentOptional.get();
            existingParent.setParentName(updatedParent.getParentName());
            existingParent.setFirstName(updatedParent.getFirstName());
            existingParent.setLastName(updatedParent.getLastName());
            // Update other fields as needed
            return parentRepository.save(existingParent);
        } else {
            throw new ParentNotFoundException("Parent not found with ID: " + id);
        }
    }

    public void deleteParent(Long id) {
        parentRepository.deleteById(id);
    }
}
