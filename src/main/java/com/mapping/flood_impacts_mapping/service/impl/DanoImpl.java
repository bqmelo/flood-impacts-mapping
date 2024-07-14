package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Dano;
import com.mapping.flood_impacts_mapping.repository.DanoRepository;
import com.mapping.flood_impacts_mapping.service.DanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanoImpl implements DanoService {

    @Autowired
    private DanoRepository danoRepository;

    @Override
    public List<Dano> getDanos() {
        return (List<Dano>) danoRepository.findAll();
    }

    @Override
    public Dano getDanoById(int id) {
        return danoRepository.findById(id).orElse(null);
    }

    @Override
    public Dano saveDano(Dano dano) {
        return danoRepository.save(dano);
    }

    @Override
    public Dano updateDano(Dano dano) {
        return danoRepository.save(dano);
    }

    @Override
    public void deleteDano(int id) {
        danoRepository.deleteById(id);
    }
}
