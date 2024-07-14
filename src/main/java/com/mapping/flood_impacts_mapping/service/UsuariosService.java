package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Usuarios;

import java.util.List;

public interface UsuariosService {
    List<Usuarios> getAllUsers();
    Usuarios getUserById(int id);
    Usuarios addUser(Usuarios user);
    Usuarios updateUser(Usuarios user);
    void deleteUser(int id) throws Exception;
}
