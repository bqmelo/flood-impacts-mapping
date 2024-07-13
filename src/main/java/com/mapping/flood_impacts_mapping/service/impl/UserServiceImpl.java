package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Users;
import com.mapping.flood_impacts_mapping.repository.UserRepository;
import com.mapping.flood_impacts_mapping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users updateUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId) throws Exception {
        Users deletedUser;
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
