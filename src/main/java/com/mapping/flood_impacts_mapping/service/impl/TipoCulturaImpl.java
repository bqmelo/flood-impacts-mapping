package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.TipoCultura;
import com.mapping.flood_impacts_mapping.repository.TipoCulturaRepository;
import com.mapping.flood_impacts_mapping.service.TipoCulturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCulturaImpl implements TipoCulturaService {

    @Autowired
    TipoCulturaRepository tipoCulturaRepository;

    @Override
    public List<TipoCultura> getAllCulturas() {
        return (List<TipoCultura>) tipoCulturaRepository.findAll();
    }

    @Override
    public TipoCultura getCulturaById(int id) {
        return tipoCulturaRepository.findById(id).orElse(null);
    }

    @Override
    public TipoCultura saveCultura(TipoCultura tipoCultura) {
        return tipoCulturaRepository.save(tipoCultura);
    }

    @Override
    public TipoCultura updateCultura(TipoCultura tipoCultura) {
        return tipoCulturaRepository.save(tipoCultura);
    }

    @Override
    public void deleteCultura(int id) {
        tipoCulturaRepository.deleteById(id);
    }
}
