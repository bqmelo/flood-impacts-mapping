package com.mapping.flood_impacts_mapping.service;

import com.mapping.flood_impacts_mapping.entity.Status;

import java.util.List;

public interface StatusService {
    List<Status> getAllStatus();
    Status getStatusById(int id);
    Status createStatus(Status status);
}
