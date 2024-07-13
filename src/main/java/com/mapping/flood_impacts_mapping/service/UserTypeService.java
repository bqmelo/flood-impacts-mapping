package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.UserType;

import java.util.List;

public interface UserTypeService {
    List<UserType> getAllUserTypes();
    UserType createUserType(UserType userType);
}
