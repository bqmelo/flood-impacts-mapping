package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.TipoUsuario;
import com.mapping.flood_impacts_mapping.repository.TipoUsuarioRepository;
import com.mapping.flood_impacts_mapping.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUsuarioImpl implements TipoUsuarioService {

    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    @Override
    public List<TipoUsuario> getAllUserTypes() {
        return (List<TipoUsuario>) tipoUsuarioRepository.findAll();
    }

    @Override
    public TipoUsuario createUserType(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
    }
}
