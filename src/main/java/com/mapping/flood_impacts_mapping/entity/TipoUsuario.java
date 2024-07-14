package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdTipoUsuario")
    private int idTipoUsuario;

    @Column(name="Descricao", nullable=false)
    private String descricao;

    public TipoUsuario() {
        super();
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
