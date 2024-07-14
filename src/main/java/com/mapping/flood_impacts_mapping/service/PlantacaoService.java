package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Plantacao;

import java.util.List;

public interface PlantacaoService {
    List<Plantacao> getAllPlantacoes();
    Plantacao getPlantacaoById(int id);
    Plantacao savePlantacao(Plantacao plantacao);
    Plantacao updatePlantacao(Plantacao plantacao);
    void deletePlantacao(int id);
}
