package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.FarmerType;

import java.util.List;

public interface FarmerTypeService {
    List<FarmerType> getAllFarmerTypes();
    FarmerType createFarmerType(FarmerType farmerType);
}
