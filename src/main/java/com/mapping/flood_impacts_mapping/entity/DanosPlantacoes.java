package com.mapping.flood_impacts_mapping.entity;

import com.mapping.flood_impacts_mapping.id.DanosPlantacoesId;
import jakarta.persistence.*;

@Entity
@Table(name = "danos_plantacoes")
@IdClass(DanosPlantacoesId.class)
public class DanosPlantacoes {

    @Id
    @ManyToOne
    @JoinColumn(name = "IdDano")
    private Dano dano;

    @Id
    @ManyToOne
    @JoinColumn(name = "IdPlantacao")
    private Plantacao plantacao;

    public Dano getDano() {
        return dano;
    }

    public void setDano(Dano dano) {
        this.dano = dano;
    }

    public Plantacao getPlantacao() {
        return plantacao;
    }

    public void setPlantacao(Plantacao plantacao) {
        this.plantacao = plantacao;
    }
}
