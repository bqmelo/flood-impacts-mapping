package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.TipoAgricultor;
import com.mapping.flood_impacts_mapping.repository.TipoAgricultorRepository;
import com.mapping.flood_impacts_mapping.service.TipoAgricultorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAgricultorImpl implements TipoAgricultorService {

    @Autowired
    private TipoAgricultorRepository tipoAgricultorRepository;

    @Override
    public List<TipoAgricultor> getAllTypes() {
        return (List<TipoAgricultor>) tipoAgricultorRepository.findAll();
    }

    @Override
    public TipoAgricultor createAgricultorType(TipoAgricultor tipoAgricultor) {
        return tipoAgricultorRepository.save(tipoAgricultor);
    }
}
