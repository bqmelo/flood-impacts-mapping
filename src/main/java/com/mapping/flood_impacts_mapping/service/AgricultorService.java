package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Agricultor;

import java.util.List;

public interface AgricultorService {
    List<Agricultor> getAllAgricultores();
    Agricultor getAgricultorById(int id);
    Agricultor createAgricultor(Agricultor agricultor);
    Agricultor updateAgricultor(Agricultor agricultor);
    void deleteAgricultor(int id);
}
