package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Neighborhood;
import com.mapping.flood_impacts_mapping.repository.NeighborhoodRepository;
import com.mapping.flood_impacts_mapping.service.NeighborhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NeighborhoodImpl implements NeighborhoodService {

    @Autowired
    private NeighborhoodRepository neighborhoodRepository;


    @Override
    public List<Neighborhood> getAllNeighborhoods() {
        return (List<Neighborhood>) neighborhoodRepository.findAll();
    }

    @Override
    public Neighborhood getNeighborhoodById(int id) {
        Optional<Neighborhood> neighborhood = neighborhoodRepository.findById(id);
        return neighborhood.orElse(null);
    }

    @Override
    public Neighborhood createNeighborhood(Neighborhood neighborhood) {
        return neighborhoodRepository.save(neighborhood);
    }
}
