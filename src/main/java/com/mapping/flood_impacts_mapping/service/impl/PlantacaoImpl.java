package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Plantacao;
import com.mapping.flood_impacts_mapping.repository.PlantacaoRepository;
import com.mapping.flood_impacts_mapping.service.PlantacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantacaoImpl implements PlantacaoService {

    @Autowired
    private PlantacaoRepository plantacaoRepository;

    @Override
    public List<Plantacao> getAllPlantacoes() {
        return (List<Plantacao>) plantacaoRepository.findAll();
    }

    @Override
    public Plantacao getPlantacaoById(int id) {
        return plantacaoRepository.findById(id).orElse(null);
    }

    @Override
    public Plantacao savePlantacao(Plantacao plantacao) {
        return plantacaoRepository.save(plantacao);
    }

    @Override
    public Plantacao updatePlantacao(Plantacao plantacao) {
        return plantacaoRepository.save(plantacao);
    }

    @Override
    public void deletePlantacao(int id) {
        plantacaoRepository.deleteById(id);
    }
}
