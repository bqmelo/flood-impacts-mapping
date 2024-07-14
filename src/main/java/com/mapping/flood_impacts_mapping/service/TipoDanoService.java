package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.TipoDano;

import java.util.List;

public interface TipoDanoService {
    List<TipoDano> getTipoDanos();
    TipoDano getTipoDanoById(int id);
    TipoDano saveTipoDano(TipoDano tipoDano);
    TipoDano updateTipoDano(TipoDano tipoDano);
    void deleteTipoDanoById(int id);
}
