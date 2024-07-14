package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.TipoAgricultor;
import com.mapping.flood_impacts_mapping.service.TipoAgricultorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmerType")
public class TipoAgricultorController {

    @Autowired
    TipoAgricultorService tipoAgricultorService;

    @GetMapping("/all")
    public ResponseEntity<List<TipoAgricultor>> getAllFarmerTypes() {
        List<TipoAgricultor> tipoAgricultors = tipoAgricultorService.getAllTypes();
        return new ResponseEntity<>(tipoAgricultors, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TipoAgricultor> createFarmerType(@RequestBody TipoAgricultor tipoAgricultor) {
        TipoAgricultor createTipoAgricultor = tipoAgricultorService.createAgricultorType(tipoAgricultor);
        return new ResponseEntity<>(createTipoAgricultor, HttpStatus.CREATED);
    }
}
