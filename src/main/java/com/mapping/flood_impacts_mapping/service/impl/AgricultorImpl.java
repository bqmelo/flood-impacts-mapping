package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Agricultor;
import com.mapping.flood_impacts_mapping.repository.AgricultorRepository;
import com.mapping.flood_impacts_mapping.service.AgricultorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgricultorImpl implements AgricultorService {

    @Autowired
    AgricultorRepository agricultorRepository;

    @Override
    public List<Agricultor> getAllAgricultores() {
        return (List<Agricultor>) agricultorRepository.findAll();
    }

    @Override
    public Agricultor getAgricultorById(int id) {
        Optional<Agricultor> farmer = agricultorRepository.findById(id);
        return farmer.orElse(null);
    }

    @Override
    public Agricultor createAgricultor(Agricultor agricultor) {
        return agricultorRepository.save(agricultor);
    }

    @Override
    public Agricultor updateAgricultor(Agricultor agricultor) {
        return agricultorRepository.save(agricultor);
    }

    @Override
    public void deleteAgricultor(int id) {
        agricultorRepository.deleteById(id);
    }
}
