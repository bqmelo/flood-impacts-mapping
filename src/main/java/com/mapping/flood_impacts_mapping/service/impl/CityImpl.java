package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.City;
import com.mapping.flood_impacts_mapping.repository.CityRepository;
import com.mapping.flood_impacts_mapping.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {
        return (List<City>) cityRepository.findAll();
    }

    @Override
    public City createCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City getCityById(int id) {
        Optional<City> city = cityRepository.findById(id);
        return city.orElse(null);
    }
}
