package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Cidade;

import java.util.List;

public interface CidadeService {
    List<Cidade> getAllCities();
    Cidade createCity(Cidade cidade);
    Cidade getCityById(int id);
}
