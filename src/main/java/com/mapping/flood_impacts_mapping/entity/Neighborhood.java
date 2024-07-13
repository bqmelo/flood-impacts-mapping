package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="bairro")
public class Neighborhood {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="IdBairro")
    private int neighborhoodId;

    @Column(name="NomeBairro")
    private String neighborhoodName;

    @ManyToOne
    @JoinColumn(name = "IdCidade")
    private City city;

    public Neighborhood() {
        super();
    }

    public int getNeighborhoodId() {
        return neighborhoodId;
    }

    public void setNeighborhoodId(int neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
