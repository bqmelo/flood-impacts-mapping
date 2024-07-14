package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Usuarios;
import com.mapping.flood_impacts_mapping.repository.UsuariosRepository;
import com.mapping.flood_impacts_mapping.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuariosRepository userRepository;

    @Override
    public List<Usuarios> getAllUsers() {
        return (List<Usuarios>) userRepository.findAll();
    }

    @Override
    public Usuarios getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public Usuarios addUser(Usuarios user) {
        return userRepository.save(user);
    }

    @Override
    public Usuarios updateUser(Usuarios user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId) throws Exception {
        Usuarios deletedUser;
        try {
            deletedUser = userRepository.findById(userId).orElse(null);

            if(deletedUser == null) {
              throw new Exception("User not found");
            } else {
                userRepository.deleteById(userId);
            }
        }
        catch (Exception e) {
            throw e;
        }
    }
}
