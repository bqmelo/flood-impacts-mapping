package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="agricultores")
public class Agricultor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "IdAgricultor")
    private int idAgricultor;

    @Column(name = "CNPJ", unique = true, nullable = false, length = 18)
    private String cnpj;

    @Column(name = "RazaoSocial", nullable = false, length = 100)
    private String razaoSocial;

    @Column(name = "AreaTotalPropriedade", nullable = false)
    private Double areaTotalPropriedade;

    @Column(name = "Rua", length = 45)
    private String rua;

    @Column(name = "Numero")
    private Integer numero;

    @Column(name = "Complemento", length = 10)
    private String complemento;

    @Column(name = "CEP", length = 9)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "IdBairro")
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "IdAnalistaGovernamental")
    private Usuarios idAnalistaGovernamental;

    @Column(name = "DataValidacao")
    private Date dataValidacao;

    @Column(name = "DataModificacao", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date dataModificacao;

    @ManyToOne
    @JoinColumn(name = "IdStatusValidacao")
    private Status idStatusValidacao;

    public Agricultor() {
        super();
    }

    public int getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(int idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Double getAreaTotalPropriedade() {
        return areaTotalPropriedade;
    }

    public void setAreaTotalPropriedade(Double areaTotalPropriedade) {
        this.areaTotalPropriedade = areaTotalPropriedade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Usuarios getIdAnalistaGovernamental() {
        return idAnalistaGovernamental;
    }

    public void setIdAnalistaGovernamental(Usuarios idAnalistaGovernamental) {
        this.idAnalistaGovernamental = idAnalistaGovernamental;
    }

    public Date getDataValidacao() {
        return dataValidacao;
    }

    public void setDataValidacao(Date dataValidacao) {
        this.dataValidacao = dataValidacao;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public Status getIdStatusValidacao() {
        return idStatusValidacao;
    }

    public void setIdStatusValidacao(Status idStatusValidacao) {
        this.idStatusValidacao = idStatusValidacao;
    }
}
