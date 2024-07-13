package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.FarmerType;
import com.mapping.flood_impacts_mapping.service.FarmerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmerType")
public class FarmerTypeController {

    @Autowired
    FarmerTypeService farmerTypeService;

    @GetMapping("/all")
    public ResponseEntity<List<FarmerType>> getAllFarmerTypes() {
        List<FarmerType> farmerTypes = farmerTypeService.getAllFarmerTypes();
        return new ResponseEntity<>(farmerTypes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FarmerType> createFarmerType(@RequestBody FarmerType farmerType) {
        FarmerType createFarmerType = farmerTypeService.createFarmerType(farmerType);
        return new ResponseEntity<>(createFarmerType, HttpStatus.CREATED);
    }
}
