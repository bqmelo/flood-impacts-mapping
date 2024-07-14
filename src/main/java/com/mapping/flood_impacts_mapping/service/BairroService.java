package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Bairro;

import java.util.List;

public interface BairroService {
    List<Bairro> getAllBairros();
    Bairro getBairroById(int id);
    Bairro createBairro(Bairro bairro);
}
