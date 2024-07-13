package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Neighborhood;

import java.util.List;

public interface NeighborhoodService {
    List<Neighborhood> getAllNeighborhoods();
    Neighborhood getNeighborhoodById(int id);
    Neighborhood createNeighborhood(Neighborhood neighborhood);
}
