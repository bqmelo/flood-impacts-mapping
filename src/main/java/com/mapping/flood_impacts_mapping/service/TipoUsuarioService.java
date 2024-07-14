package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.TipoUsuario;

import java.util.List;

public interface TipoUsuarioService {
    List<TipoUsuario> getAllUserTypes();
    TipoUsuario createUserType(TipoUsuario tipoUsuario);
}
