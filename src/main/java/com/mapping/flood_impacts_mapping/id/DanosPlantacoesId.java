package com.mapping.flood_impacts_mapping.id;

import java.io.Serializable;

public class DanosPlantacoesId implements Serializable {

    private int idDano;
    private int idPlantacao;

    public int getIdDano() {
        return idDano;
    }

    public void setIdDano(int idDano) {
        this.idDano = idDano;
    }

    public int getIdPlantacao() {
        return idPlantacao;
    }

    public void setIdPlantacao(int idPlantacao) {
        this.idPlantacao = idPlantacao;
    }
}