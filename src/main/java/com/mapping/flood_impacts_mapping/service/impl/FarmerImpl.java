package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Farmer;
import com.mapping.flood_impacts_mapping.repository.FarmerRepository;
import com.mapping.flood_impacts_mapping.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmerImpl implements FarmerService {

    @Autowired
    FarmerRepository farmerRepository;

    @Override
    public List<Farmer> getFarmers() {
        return (List<Farmer>) farmerRepository.findAll();
    }

    @Override
    public Farmer getFarmerById(int id) {
        Optional<Farmer> farmer = farmerRepository.findById(id);
        return farmer.orElse(null);
    }

    @Override
    public Farmer createFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public Farmer updateFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public void deleteFarmer(int id) {
        farmerRepository.deleteById(id);
    }
}
