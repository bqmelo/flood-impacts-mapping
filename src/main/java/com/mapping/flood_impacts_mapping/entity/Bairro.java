package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="bairro")
public class Bairro {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_bairro")
    private int idBairro;

    @Column(name="nome_bairro")
    private String nomeBairro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
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
