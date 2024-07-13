package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.UserType;
import com.mapping.flood_impacts_mapping.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userTypes")
public class UserTypeController {

    @Autowired
    UserTypeService userTypeService;

    @GetMapping
    public ResponseEntity<List<UserType>> getAllUserTypes() {
        List<UserType> userTypes = userTypeService.getAllUserTypes();
        return new ResponseEntity<>(userTypes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserType> createUserType(@RequestBody UserType userType) {
        UserType createdUserType = userTypeService.createUserType(userType);
        return new ResponseEntity<>(createdUserType, HttpStatus.CREATED);
    }
}
