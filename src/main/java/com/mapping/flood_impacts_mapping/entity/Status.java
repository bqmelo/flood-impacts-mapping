package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="status_validacao")
public class Status {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "IdStatusValidacao")
    private int statusId;

    @Column(name="DescricaoStatus", nullable=false)
    private String description;

    public Status() {
        super();
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
