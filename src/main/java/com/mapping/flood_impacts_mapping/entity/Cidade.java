package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdCidade")
    private int idCidade;

    @Column(name="NomeCidade", nullable=false)
    private String nomeCidade;

    public Cidade() {
        super();
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}
