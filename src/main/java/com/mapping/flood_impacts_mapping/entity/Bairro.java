package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="bairro")
public class Bairro {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="IdBairro")
    private int idBairro;

    @Column(name="NomeBairro")
    private String nomeBairro;

    @ManyToOne
    @JoinColumn(name = "IdCidade")
    private Cidade idCidade;

    public Bairro() {
        super();
    }

    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public Cidade getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Cidade idCidade) {
        this.idCidade = idCidade;
    }
}
