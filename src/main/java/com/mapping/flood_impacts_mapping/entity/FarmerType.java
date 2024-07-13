package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tipo_agricultor")
public class FarmerType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdTipoAgricultor")
    private Integer farmerTypeId;

    @Column(name="Descricao", nullable=false)
    private String description;

    public FarmerType() {
        super();
    }

    public int getFarmerTypeId() {
        return farmerTypeId;
    }

    public void setFarmerTypeId(int farmerTypeId) {
        this.farmerTypeId = farmerTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
