package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tipo_agricultor")
public class TipoAgricultor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdTipoAgricultor")
    private Integer idTipoAgricultor;

    @Column(name="Descricao", nullable=false)
    private String descricao;

    public TipoAgricultor() {
        super();
    }

    public Integer getIdTipoAgricultor() {
        return idTipoAgricultor;
    }

    public void setIdTipoAgricultor(Integer idTipoAgricultor) {
        this.idTipoAgricultor = idTipoAgricultor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
