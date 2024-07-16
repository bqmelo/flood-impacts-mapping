package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Agricultor;
import io.swagger.models.auth.In;

import java.util.List;

public interface AgricultorService {
    List<Agricultor> getAllAgricultores(String agricultorName);
    Agricultor getAgricultorById(int id);
    Agricultor createAgricultor(Agricultor agricultor);
    Agricultor updateAgricultor(Agricultor agricultor);
    void deleteAgricultor(int id);
}
