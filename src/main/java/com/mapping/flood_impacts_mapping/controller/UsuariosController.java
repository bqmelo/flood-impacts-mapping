package com.mapping.flood_impacts_mapping.controller;

import com.mapping.flood_impacts_mapping.entity.Usuarios;
import com.mapping.flood_impacts_mapping.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/allUsers")
    public ResponseEntity<List<Usuarios>> getAllUsers() {
        List<Usuarios> users = null;
        try {
            users = usuariosService.getAllUsers();
        }
        catch (Exception e) {
            e.getMessage();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Usuarios> getUsersByID(@PathVariable("userId") int userId) {
        Usuarios usuarios;
        try {
            usuarios = usuariosService.getUserById(userId);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Usuarios> addUser(@RequestBody Usuarios user) {
        Usuarios usuarios;
        try {
            usuarios = usuariosService.addUser(user);
        }
        catch (Exception e) {
            e.getMessage();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<Usuarios> updateUser(@PathVariable("userId") int userId, @RequestBody Usuarios user) {
        Usuarios existingUser = usuariosService.getUserById(userId);
        if (existingUser == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        existingUser.setNome(user.getNome());
        existingUser.setEmail(user.getEmail());
        existingUser.setSenha(user.getSenha());
        existingUser.setTelefone(user.getTelefone());
        existingUser.setAprovado(user.getAprovado());
        existingUser.setDataModificacao(new Date());

        Usuarios savedUser;
        try {
            savedUser = usuariosService.updateUser(existingUser);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable("userId") int userId) {
        Usuarios user = usuariosService.getUserById(userId);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            usuariosService.deleteUser(userId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
