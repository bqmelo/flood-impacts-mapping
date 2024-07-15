package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="danos")
public class Dano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_dano")
    private int idDano;

    @ManyToOne
    @JoinColumn(name = "id_agricultor")
    private Agricultor agricultor;

    @ManyToOne
    @JoinColumn(name = "id_plantacao")
    private Plantacao plantacao;

    @ManyToOne
    @JoinColumn(name = "id_tipo_dano")
    private TipoDano tipoDano;

    @Column(name = "valor_estimado", nullable = false)
    private Double valorEstimado;

    @Column(name = "data_ocorrencia", nullable = false)
    private Date dataOcorrencia;

    @Column(name = "aprovado", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean aprovado;

    @Column(name = "resolvido", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean resolvido;

    @Column(name = "data_resolucao")
    private Date dataResolucao;

    public Dano() {
        super();
    }

    public int getIdDano() {
        return idDano;
    }

    public void setIdDano(int idDano) {
        this.idDano = idDano;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }

    public Plantacao getPlantacao() {
        return plantacao;
    }

    public void setPlantacao(Plantacao plantacao) {
        this.plantacao = plantacao;
    }

    public TipoDano getTipoDano() {
        return tipoDano;
    }

    public void setTipoDano(TipoDano tipoDano) {
        this.tipoDano = tipoDano;
    }

    public Double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(Double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Boolean getResolvido() {
        return resolvido;
    }

    public void setResolvido(Boolean resolvido) {
        this.resolvido = resolvido;
    }

    public Date getDataResolucao() {
        return dataResolucao;
    }

    public void setDataResolucao(Date dataResolucao) {
        this.dataResolucao = dataResolucao;
    }
}
