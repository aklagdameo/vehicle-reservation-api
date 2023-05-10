package com.akml.vra.service;

import com.akml.vra.model.Driver;
import com.akml.vra.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public void create(Driver driver) {
        driverRepository.save(driver);
    }

    public Driver getDriverById(Long id) {
        return driverRepository.findById(id)
                .orElse(null);
    }

    public void delete(Long id) {
        driverRepository.findById(id)
                .ifPresent(driver -> driverRepository.delete(driver));
    }
}