package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="plantacoes")
public class Plantacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_plantacao")
    private int idPlantacao;

    @ManyToOne
    @JoinColumn(name = "id_agricultor")
    private Agricultor agricultor;

    @ManyToOne
    @JoinColumn(name = "id_tipo_cultura")
    private TipoCultura tipoCultura;

    @Column(name = "area_plantacao", nullable = false)
    private Float areaPlantacao;

    @Column(name = "afetada", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean afetada;

    public Plantacao() {
        super();
    }

    public int getIdPlantacao() {
        return idPlantacao;
    }

    public void setIdPlantacao(int idPlantacao) {
        this.idPlantacao = idPlantacao;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }

    public TipoCultura getTipoCultura() {
        return tipoCultura;
    }

    public void setTipoCultura(TipoCultura tipoCultura) {
        this.tipoCultura = tipoCultura;
    }

    public Float getAreaPlantacao() {
        return areaPlantacao;
    }

    public void setAreaPlantacao(Float areaPlantacao) {
        this.areaPlantacao = areaPlantacao;
    }

    public Boolean getAfetada() {
        return afetada;
    }

    public void setAfetada(Boolean afetada) {
        this.afetada = afetada;
    }
}
