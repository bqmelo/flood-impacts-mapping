package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cidade")
public class City {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdCidade")
    private int cityId;

    @Column(name="NomeCidade", nullable=false)
    private String cityName;

    public City() {
        super();
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
