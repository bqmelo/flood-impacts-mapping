package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Farmer;

import java.util.List;

public interface FarmerService {
    List<Farmer> getFarmers();
    Farmer getFarmerById(int id);
    Farmer createFarmer(Farmer farmer);
    Farmer updateFarmer(Farmer farmer);
    void deleteFarmer(int id);
}
