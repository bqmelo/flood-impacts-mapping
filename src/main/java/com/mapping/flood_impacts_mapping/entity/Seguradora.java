package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="seguradora")
public class Seguradora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdSeguradora")
    private int idSeguradora;

    @ManyToOne
    @JoinColumn(name = "IdDano")
    private Dano dano;

    @Column(name = "RazaoSocial", nullable = false, length = 45)
    private String razaoSocial;

    @Column(name = "ValorApolice", nullable = false)
    private Double valorApolice;

    @Column(name = "DataReavaliacao")
    private Date dataReavaliacao;

    public Seguradora() {
        super();
    }

    public int getIdSeguradora() {
        return idSeguradora;
    }

    public void setIdSeguradora(int idSeguradora) {
        this.idSeguradora = idSeguradora;
    }

    public Dano getDano() {
        return dano;
    }

    public void setDano(Dano dano) {
        this.dano = dano;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Double getValorApolice() {
        return valorApolice;
    }

    public void setValorApolice(Double valorApolice) {
        this.valorApolice = valorApolice;
    }

    public Date getDataReavaliacao() {
        return dataReavaliacao;
    }

    public void setDataReavaliacao(Date dataReavaliacao) {
        this.dataReavaliacao = dataReavaliacao;
    }
}
