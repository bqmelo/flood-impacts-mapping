package com.mapping.flood_impacts_mapping.service.impl;

import com.mapping.flood_impacts_mapping.entity.Status;
import com.mapping.flood_impacts_mapping.repository.StatusRepository;
import com.mapping.flood_impacts_mapping.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;


    @Override
    public List<Status> getAllStatus() {
        return (List<Status>) statusRepository.findAll();
    }

    @Override
    public Status getStatusById(int id) {
        Optional<Status> status = statusRepository.findById(id);
        return status.orElse(null);
    }

    @Override
    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }
}
