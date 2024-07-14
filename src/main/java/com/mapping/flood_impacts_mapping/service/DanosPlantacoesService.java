package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.DanosPlantacoes;

import java.util.List;

public interface DanosPlantacoesService {
    List<DanosPlantacoes> getAllDanosPlantacoes();
    DanosPlantacoes getDanosPlantacoesById(int id);
}
