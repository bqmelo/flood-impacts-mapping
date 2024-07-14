package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tipo_cultura")
public class TipoCultura {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "IdTipoCultura")
    private Long idTipoCultura;

    @Column(name = "Descricao", nullable=false, length=20)
    private String descricao;

    public TipoCultura() {
        super();
    }

    public Long getIdTipoCultura() {
        return idTipoCultura;
    }

    public void setIdTipoCultura(Long idTipoCultura) {
        this.idTipoCultura = idTipoCultura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
