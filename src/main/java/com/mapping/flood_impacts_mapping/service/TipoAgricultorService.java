package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.TipoAgricultor;

import java.util.List;

public interface TipoAgricultorService {
    List<TipoAgricultor> getAllTypes();
    TipoAgricultor createAgricultorType(TipoAgricultor tipoAgricultor);
}
