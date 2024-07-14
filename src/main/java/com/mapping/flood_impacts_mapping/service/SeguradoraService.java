package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Seguradora;

import java.util.List;

public interface SeguradoraService {
    List<Seguradora> getAllSeguradoras();
    Seguradora getSeguradoraById(int id);
    Seguradora saveSeguradora(Seguradora seguradora);
    void deleteSeguradora(int id);
}
