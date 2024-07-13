package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.UserType;
import com.mapping.flood_impacts_mapping.repository.UserTypeRepository;
import com.mapping.flood_impacts_mapping.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeImpl implements UserTypeService {

    @Autowired
    UserTypeRepository userTypeRepository;

    @Override
    public List<UserType> getAllUserTypes() {
        return (List<UserType>) userTypeRepository.findAll();
    }

    @Override
    public UserType createUserType(UserType userType) {
        return userTypeRepository.save(userType);
    }
}
