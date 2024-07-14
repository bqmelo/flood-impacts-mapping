package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Seguradora;
import com.mapping.flood_impacts_mapping.service.SeguradoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seguradora")
public class SeguradoraController {

    @Autowired
    private SeguradoraService seguradoraService;

    @GetMapping
    public ResponseEntity<List<Seguradora>> getAllSeguradoras() {
        List<Seguradora> seguradoras = seguradoraService.getAllSeguradoras();
        return new ResponseEntity<>(seguradoras, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seguradora> getSeguradoraById(@PathVariable int id) {
        Seguradora seguradora = seguradoraService.getSeguradoraById(id);
        if (seguradora != null) {
            return new ResponseEntity<>(seguradora, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Seguradora> createSeguradora(@RequestBody Seguradora seguradora) {
        Seguradora createdSeguradora = seguradoraService.saveSeguradora(seguradora);
        return new ResponseEntity<>(createdSeguradora, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Seguradora> updateSeguradora(
            @PathVariable int id,
            @RequestBody Seguradora seguradoraDetails) {
        Seguradora seguradora = seguradoraService.getSeguradoraById(id);
        if (seguradora != null) {
            seguradora.setDano(seguradoraDetails.getDano());
            seguradora.setRazaoSocial(seguradoraDetails.getRazaoSocial());
            seguradora.setValorApolice(seguradoraDetails.getValorApolice());
            seguradora.setDataReavaliacao(seguradoraDetails.getDataReavaliacao());
            Seguradora updatedSeguradora = seguradoraService.saveSeguradora(seguradora);
            return new ResponseEntity<>(updatedSeguradora, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSeguradora(@PathVariable int id) {
        seguradoraService.deleteSeguradora(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
