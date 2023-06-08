package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Location;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @GetMapping("/{id}")
    public Location getLocationById(@PathVariable String id) {
        // Implement your logic to fetch location details by ID from a database or any other source
        // Return the location object
    	return getLocationById(id);
    }
}
