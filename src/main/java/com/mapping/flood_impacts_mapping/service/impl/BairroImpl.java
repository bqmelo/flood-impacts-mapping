package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Bairro;
import com.mapping.flood_impacts_mapping.repository.BairroRepository;
import com.mapping.flood_impacts_mapping.service.BairroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BairroImpl implements BairroService {

    @Autowired
    private BairroRepository bairroRepository;


    @Override
    public List<Bairro> getAllBairros() {
        return (List<Bairro>) bairroRepository.findAll();
    }

    @Override
    public Bairro getBairroById(int id) {
        Optional<Bairro> neighborhood = bairroRepository.findById(id);
        return neighborhood.orElse(null);
    }

    @Override
    public Bairro createBairro(Bairro bairro) {
        return bairroRepository.save(bairro);
    }
}
