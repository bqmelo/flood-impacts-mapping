package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Seguradora;
import com.mapping.flood_impacts_mapping.repository.SeguradoraRepository;
import com.mapping.flood_impacts_mapping.service.SeguradoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguradoraImpl implements SeguradoraService {

    @Autowired
    private SeguradoraRepository seguradoraRepository;

    @Override
    public List<Seguradora> getAllSeguradoras() {
        return (List<Seguradora>) seguradoraRepository.findAll();
    }

    @Override
    public Seguradora getSeguradoraById(int id) {
        return seguradoraRepository.findById(id).orElse(null);
    }

    @Override
    public Seguradora saveSeguradora(Seguradora seguradora) {
        return seguradoraRepository.save(seguradora);
    }

    @Override
    public void deleteSeguradora(int id) {
        seguradoraRepository.deleteById(id);
    }
}
