package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Plantacao;
import com.mapping.flood_impacts_mapping.service.PlantacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platacoes")
public class PlantacaoController {

    @Autowired
    private PlantacaoService plantacaoService;

    @GetMapping
    public ResponseEntity<List<Plantacao>> getAllPlantacoes() {
        List<Plantacao> plantacoes = plantacaoService.getAllPlantacoes();
        return new ResponseEntity<>(plantacoes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plantacao> getPlantacaoById(@PathVariable int id) {
        Plantacao plantacao = plantacaoService.getPlantacaoById(id);
        if (plantacao != null) {
            return new ResponseEntity<>(plantacao, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Plantacao> createPlantacao(@RequestBody Plantacao plantacao) {
        Plantacao createdPlantacao = plantacaoService.savePlantacao(plantacao);
        return new ResponseEntity<>(createdPlantacao, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plantacao> updatePlantacao(
            @PathVariable int id,
            @RequestBody Plantacao plantacaoDetails) {
        Plantacao plantacao = plantacaoService.getPlantacaoById(id);
        if (plantacao != null) {
            plantacao.setAgricultor(plantacaoDetails.getAgricultor());
            plantacao.setTipoCultura(plantacaoDetails.getTipoCultura());
            plantacao.setAreaPlantacao(plantacaoDetails.getAreaPlantacao());
            plantacao.setAfetada(plantacaoDetails.getAfetada());
            Plantacao updatedPlantacao = plantacaoService.savePlantacao(plantacao);
            return new ResponseEntity<>(updatedPlantacao, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlantacao(@PathVariable int id) {
        plantacaoService.deletePlantacao(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
