package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.FarmerType;
import com.mapping.flood_impacts_mapping.repository.FarmerTypeRepository;
import com.mapping.flood_impacts_mapping.service.FarmerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerTypeImpl implements FarmerTypeService {

    @Autowired
    private FarmerTypeRepository farmerTypeRepository;

    @Override
    public List<FarmerType> getAllFarmerTypes() {
        return (List<FarmerType>) farmerTypeRepository.findAll();
    }

    @Override
    public FarmerType createFarmerType(FarmerType farmerType) {
        return farmerTypeRepository.save(farmerType);
    }
}
