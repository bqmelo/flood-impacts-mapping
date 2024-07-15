package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Dano;
import com.mapping.flood_impacts_mapping.service.DanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/danos")
public class DanoController {

    @Autowired
    private DanoService danoService;

    @GetMapping
    public ResponseEntity<List<Dano>> getAllDanos(
            @RequestParam(value = "agricultorId", required = false) Integer agricultorId,
            @RequestParam(value = "isSolved", required = false) Boolean isSolved,
            @RequestParam(value = "cultura", required = false) String cultura
    ) {
        List<Dano> danos = danoService.getDanos(agricultorId, isSolved, cultura);
        return new ResponseEntity<>(danos, HttpStatus.OK);
    }

    @GetMapping("danosSemSeguro")
    public ResponseEntity<List<Dano>> getDanosSemSeguro() {
        List<Dano> danosSemSeguro = danoService.getDanosSemSeguro();
        return new ResponseEntity<>(danosSemSeguro, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dano> getDanoById(@PathVariable int id) {
        Dano dano = danoService.getDanoById(id);
        if (dano != null) {
            return new ResponseEntity<>(dano, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Dano> createDano(@RequestBody Dano dano) {
        Dano createdDano = danoService.saveDano(dano);
        return new ResponseEntity<>(createdDano, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dano> updateDano(
            @PathVariable int id,
            @RequestBody Dano danoDetails) {
        Dano dano = danoService.getDanoById(id);
        if (dano != null) {
            dano.setAgricultor(danoDetails.getAgricultor());
            dano.setPlantacao(danoDetails.getPlantacao());
            dano.setTipoDano(danoDetails.getTipoDano());
            dano.setValorEstimado(danoDetails.getValorEstimado());
            dano.setDataOcorrencia(danoDetails.getDataOcorrencia());
            dano.setAprovado(danoDetails.getAprovado());
            dano.setResolvido(danoDetails.getResolvido());
            dano.setDataResolucao(danoDetails.getDataResolucao());
            Dano updatedDano = danoService.saveDano(dano);
            return new ResponseEntity<>(updatedDano, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDano(@PathVariable int id) {
        danoService.deleteDano(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
