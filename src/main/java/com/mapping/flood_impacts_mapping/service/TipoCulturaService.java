package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.TipoCultura;

import java.util.List;

public interface TipoCulturaService {
    List<TipoCultura> getAllCulturas();
    TipoCultura getCulturaById(int id);
    TipoCultura saveCultura(TipoCultura tipoCultura);
    TipoCultura updateCultura(TipoCultura tipoCultura);
    void deleteCultura(int id);
}
