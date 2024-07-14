package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_dano")
public class TipoDano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdTipoDano")
    private int idTipoDano;

    @Column(name = "Descricao", nullable = false, length = 20)
    private String descricao;

    public TipoDano() {
        super();
    }

    public int getIdTipoDano() {
        return idTipoDano;
    }

    public void setIdTipoDano(int idTipoDano) {
        this.idTipoDano = idTipoDano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
