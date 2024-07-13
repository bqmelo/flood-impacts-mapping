package com.mapping.flood_impacts_mapping.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="usuarios")
public class Users {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdUsuario")
    private int userId;

    @Column(name="Nome", nullable=false)
    private String name;

    @Column(name="Email", nullable=false, unique = true)
    private String email;

    @Column(name="Telefone", nullable=false)
    private String phoneNumber;

    @Column(name="Senha", nullable=false)
    private String password;

    @Column(name="IdTipoUsuario")
    private int userType;

    @Column(name="Aprovado", columnDefinition="BOOLEAN DEFAULT FALSE")
    private boolean isApproved;

    @Column(name="DataCadastro", nullable=false, updatable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name="DataModificacao", nullable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updatedDate;

    public Users() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                ", isApproved=" + isApproved +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}



