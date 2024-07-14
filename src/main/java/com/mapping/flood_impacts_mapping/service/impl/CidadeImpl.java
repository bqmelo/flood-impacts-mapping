package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Cidade;
import com.mapping.flood_impacts_mapping.repository.CidadeRepository;
import com.mapping.flood_impacts_mapping.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeImpl implements CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public List<Cidade> getAllCities() {
        return (List<Cidade>) cidadeRepository.findAll();
    }

    @Override
    public Cidade createCity(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    @Override
    public Cidade getCityById(int id) {
        Optional<Cidade> city = cidadeRepository.findById(id);
        return city.orElse(null);
    }
}
