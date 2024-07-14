package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.TipoUsuario;
import com.mapping.flood_impacts_mapping.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userTypes")
public class TipoUsuarioController {

    @Autowired
    TipoUsuarioService tipoUsuarioService;

    @GetMapping
    public ResponseEntity<List<TipoUsuario>> getAllUserTypes() {
        List<TipoUsuario> tipoUsuarios = tipoUsuarioService.getAllUserTypes();
        return new ResponseEntity<>(tipoUsuarios, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TipoUsuario> createUserType(@RequestBody TipoUsuario tipoUsuario) {
        TipoUsuario createdTipoUsuario = tipoUsuarioService.createUserType(tipoUsuario);
        return new ResponseEntity<>(createdTipoUsuario, HttpStatus.CREATED);
    }
}
