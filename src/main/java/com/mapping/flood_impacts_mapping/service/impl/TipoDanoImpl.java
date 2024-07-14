package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.TipoDano;
import com.mapping.flood_impacts_mapping.repository.TipoDanoRepository;
import com.mapping.flood_impacts_mapping.service.TipoDanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDanoImpl implements TipoDanoService {

    @Autowired
    private TipoDanoRepository tipoDanoRepository;


    @Override
    public List<TipoDano> getTipoDanos() {
        return (List<TipoDano>) tipoDanoRepository.findAll();
    }

    @Override
    public TipoDano getTipoDanoById(int id) {
        return tipoDanoRepository.findById(id).orElse(null);
    }

    @Override
    public TipoDano saveTipoDano(TipoDano tipoDano) {
        return tipoDanoRepository.save(tipoDano);
    }

    @Override
    public TipoDano updateTipoDano(TipoDano tipoDano) {
        return tipoDanoRepository.save(tipoDano);
    }

    @Override
    public void deleteTipoDanoById(int id) {
        tipoDanoRepository.deleteById(id);
    }
}
