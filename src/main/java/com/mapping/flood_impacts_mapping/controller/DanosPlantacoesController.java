package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.DanosPlantacoes;
import com.mapping.flood_impacts_mapping.id.DanosPlantacoesId;
import com.mapping.flood_impacts_mapping.service.DanosPlantacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/danosPlantacoes")
public class DanosPlantacoesController {

    @Autowired
    private DanosPlantacoesService danosPlantacoesService;

    @GetMapping
    public ResponseEntity<List<DanosPlantacoes>> getAllDanosPlantacoes() {
        List<DanosPlantacoes> danosPlantacoes = danosPlantacoesService.getAllDanosPlantacoes();
        return new ResponseEntity<>(danosPlantacoes, HttpStatus.OK);
    }
}
