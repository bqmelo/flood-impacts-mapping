package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.City;

import java.util.List;

public interface CityService {
    List<City> getAllCities();
    City createCity(City city);
    City getCityById(int id);
}
