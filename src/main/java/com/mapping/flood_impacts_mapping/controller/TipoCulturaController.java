package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.TipoCultura;
import com.mapping.flood_impacts_mapping.service.TipoCulturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoCultura")
public class TipoCulturaController {

    @Autowired
    private TipoCulturaService tipoCulturaService;

    @GetMapping
    public ResponseEntity<List<TipoCultura>> getAllTiposCultura() {
        List<TipoCultura> tiposCultura = tipoCulturaService.getAllCulturas();
        return new ResponseEntity<>(tiposCultura, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoCultura> getTipoCulturaById(@PathVariable int id) {
        TipoCultura tipoCultura = tipoCulturaService.getCulturaById(id);
        if (tipoCultura != null) {
            return new ResponseEntity<>(tipoCultura, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<TipoCultura> createTipoCultura(@RequestBody TipoCultura tipoCultura) {
        TipoCultura createdTipoCultura = tipoCulturaService.saveCultura(tipoCultura);
        return new ResponseEntity<>(createdTipoCultura, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoCultura> updateTipoCultura(
            @PathVariable int id,
            @RequestBody TipoCultura tipoCulturaDetails) {
        TipoCultura tipoCultura = tipoCulturaService.getCulturaById(id);
        if (tipoCultura != null) {
            tipoCultura.setDescricao(tipoCulturaDetails.getDescricao());
            TipoCultura updatedTipoCultura = tipoCulturaService.saveCultura(tipoCultura);
            return new ResponseEntity<>(updatedTipoCultura, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoCultura(@PathVariable int id) {
        tipoCulturaService.deleteCultura(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
