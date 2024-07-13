package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Neighborhood;
import com.mapping.flood_impacts_mapping.service.NeighborhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/neighborhood")
public class NeighborhoodController {

    @Autowired
    private NeighborhoodService neighborhoodService;

    @GetMapping("all")
    public ResponseEntity<List<Neighborhood>> getNeighborhoods() {
        List<Neighborhood> neighborhoods = neighborhoodService.getAllNeighborhoods();
        return new ResponseEntity<>(neighborhoods, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Neighborhood> getNeighborhoodById(@PathVariable("id") int id) {
        Neighborhood neighborhood = neighborhoodService.getNeighborhoodById(id);
        if (neighborhood == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(neighborhood, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Neighborhood> createNeighborhood(@RequestBody Neighborhood neighborhood) {
        Neighborhood newNeighborhood = neighborhoodService.createNeighborhood(neighborhood);
        return new ResponseEntity<>(newNeighborhood, HttpStatus.CREATED);
    }
}
