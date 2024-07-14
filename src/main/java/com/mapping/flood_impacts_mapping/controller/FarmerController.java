package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Farmer;
import com.mapping.flood_impacts_mapping.entity.FarmerType;
import com.mapping.flood_impacts_mapping.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmer")
public class FarmerController {

    @Autowired
    FarmerService farmerService;

    @GetMapping
    public ResponseEntity<List<Farmer>> getAllFarmers() {
        List<Farmer> farmers = farmerService.getFarmers();
        return new ResponseEntity<>(farmers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Farmer> getFarmerById(@PathVariable int id) {
        Farmer farmer = farmerService.getFarmerById(id);
        if (farmer == null) {
            return ResponseEntity.notFound().build();
        } else {
            return new ResponseEntity<>(farmer, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<Farmer> createFarmer(@RequestBody Farmer farmer) {
        Farmer createdFarmer = farmerService.createFarmer(farmer);
        return new ResponseEntity<>(createdFarmer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Farmer> updateFarmer(@PathVariable int id, @RequestBody Farmer farmer) {
        farmer.setFarmerId(id);
        Farmer updatedFarmer = farmerService.updateFarmer(farmer);
        return new ResponseEntity<>(updatedFarmer, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Farmer> deleteFarmer(@PathVariable int id) {
        farmerService.deleteFarmer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
