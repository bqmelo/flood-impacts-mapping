package com.mapping.flood_impacts_mapping.entity;

import com.mapping.flood_impacts_mapping.service.StatusService;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="agricultores")
public class Farmer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "IdAgricultor")
    private int farmerId;

    @Column(name = "CNPJ", unique = true, nullable = false, length = 18)
    private String taxId;

    @Column(name = "RazaoSocial", nullable = false, length = 100)
    private String companyLegalName;

    @Column(name = "AreaTotalPropriedade", nullable = false)
    private Double sizeOfFarm;

    @Column(name = "Rua", length = 45)
    private String streetAddress;

    @Column(name = "Numero")
    private Integer number;

    @Column(name = "Complemento", length = 10)
    private String complement;

    @Column(name = "CEP", length = 9)
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "IdBairro")
    private Neighborhood neighborhood;

    @ManyToOne
    @JoinColumn(name = "IdAnalistaGovernamental")
    private Users analistaGovernamentalId;

    @Column(name = "DataValidacao")
    private Date validationDate;

    @Column(name = "DataModificacao", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updatedDate;

    @ManyToOne
    @JoinColumn(name = "IdStatusValidacao")
    private Status validationStatus;

    public Farmer() {
        super();
    }

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getCompanyLegalName() {
        return companyLegalName;
    }

    public void setCompanyLegalName(String companyLegalName) {
        this.companyLegalName = companyLegalName;
    }

    public Double getSizeOfFarm() {
        return sizeOfFarm;
    }

    public void setSizeOfFarm(Double sizeOfFarm) {
        this.sizeOfFarm = sizeOfFarm;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Users getAnalistaGovernamentalId() {
        return analistaGovernamentalId;
    }

    public void setAnalistaGovernamentalId(Users analistaGovernamentalId) {
        this.analistaGovernamentalId = analistaGovernamentalId;
    }

    public Date getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(Date validationDate) {
        this.validationDate = validationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Status getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(Status validationStatus) {
        this.validationStatus = validationStatus;
    }
}
