package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Bairro;
import com.mapping.flood_impacts_mapping.service.BairroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bairro")
public class BairroController {

    @Autowired
    private BairroService bairroService;

    @GetMapping("/all")
    public ResponseEntity<List<Bairro>> getAllBairros() {
        List<Bairro> bairros = bairroService.getAllBairros();
        return new ResponseEntity<>(bairros, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bairro> getBairroById(@PathVariable("id") int id) {
        Bairro bairro = bairroService.getBairroById(id);
        if (bairro == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bairro, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Bairro> createBairro(@RequestBody Bairro bairro) {
        Bairro newBairro = bairroService.createBairro(bairro);
        return new ResponseEntity<>(newBairro, HttpStatus.CREATED);
    }
}
