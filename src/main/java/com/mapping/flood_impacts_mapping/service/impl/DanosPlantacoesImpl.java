package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.DanosPlantacoes;
import com.mapping.flood_impacts_mapping.repository.DanosPlantacoesRepository;
import com.mapping.flood_impacts_mapping.service.DanosPlantacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanosPlantacoesImpl implements DanosPlantacoesService {

    @Autowired
    private DanosPlantacoesRepository danosPlantacoesRepository;

    @Override
    public List<DanosPlantacoes> getAllDanosPlantacoes() {
        return (List<DanosPlantacoes>) danosPlantacoesRepository.findAll();
    }

    @Override
    public DanosPlantacoes getDanosPlantacoesById(int id) {
        return danosPlantacoesRepository.findById(id).orElse(null);
    }
}
