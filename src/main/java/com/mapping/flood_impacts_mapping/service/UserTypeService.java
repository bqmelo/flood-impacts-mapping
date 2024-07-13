package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.UserType;

import java.util.List;
import java.util.Optional;

public interface UserTypeService {
    List<UserType> getAllUserTypes();
    UserType createUserType(UserType userType);
    UserType updateUserType(UserType userType);
    Optional<UserType> getUserTypeById(int id);
}
