package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Cidade;
import com.mapping.flood_impacts_mapping.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping("all")
    public ResponseEntity<List<Cidade>> getAllCities() {
        List<Cidade> cities = cidadeService.getAllCities();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> getCityById(@PathVariable int id) {
        Cidade cidade = cidadeService.getCityById(id);
        if (cidade == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cidade, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cidade> createCity(@RequestBody Cidade cidade) {
        Cidade createdCidade = cidadeService.createCity(cidade);
        return new ResponseEntity<>(createdCidade, HttpStatus.CREATED);
    }
}
