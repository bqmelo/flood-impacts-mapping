package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Status;
import com.mapping.flood_impacts_mapping.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping
    public ResponseEntity<List<Status>> getAllStatuses() {
        List<Status> statuses = statusService.getAllStatus();
        return new ResponseEntity<>(statuses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Status> getStatusById(@PathVariable int id) {
        Status status = statusService.getStatusById(id);
        if (status == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Status> createStatus(@RequestBody Status status) {
        Status createdStatus = statusService.createStatus(status);
        return new ResponseEntity<>(createdStatus, HttpStatus.CREATED);
    }
}
