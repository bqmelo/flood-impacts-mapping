package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Dano;

import java.util.List;

public interface DanoService {
    List<Dano> getDanos(
            Integer agricultorId,
            Boolean isSolved,
            String cultura
    );
    List<Dano> getDanosSemSeguro();
    Dano getDanoById(int id);
    Dano saveDano(Dano dano);
    void deleteDano(int id);
}
