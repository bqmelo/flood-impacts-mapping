package com.mapping.flood_impacts_mapping.repository;

import com.mapping.flood_impacts_mapping.entity.Neighborhood;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodRepository extends CrudRepository<Neighborhood, Integer> {
}
