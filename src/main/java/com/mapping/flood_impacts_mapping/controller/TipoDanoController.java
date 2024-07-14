package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.TipoDano;
import com.mapping.flood_impacts_mapping.service.TipoDanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoDanos")
public class TipoDanoController {

    @Autowired
    private TipoDanoService tipoDanoService;

    @GetMapping
    public ResponseEntity<List<TipoDano>> getAllTiposDano() {
        List<TipoDano> tiposDano = tipoDanoService.getTipoDanos();
        return new ResponseEntity<>(tiposDano, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDano> getTipoDanoById(@PathVariable int id) {
        TipoDano tipoDano = tipoDanoService.getTipoDanoById(id);
        if (tipoDano != null) {
            return new ResponseEntity<>(tipoDano, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<TipoDano> createTipoDano(@RequestBody TipoDano tipoDano) {
        TipoDano createdTipoDano = tipoDanoService.saveTipoDano(tipoDano);
        return new ResponseEntity<>(createdTipoDano, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoDano> updateTipoDano(
            @PathVariable int id,
            @RequestBody TipoDano tipoDanoDetails) {
        TipoDano tipoDano = tipoDanoService.getTipoDanoById(id);
        if (tipoDano != null) {
            tipoDano.setDescricao(tipoDanoDetails.getDescricao());
            TipoDano updatedTipoDano = tipoDanoService.saveTipoDano(tipoDano);
            return new ResponseEntity<>(updatedTipoDano, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoDano(@PathVariable int id) {
        tipoDanoService.deleteTipoDanoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
