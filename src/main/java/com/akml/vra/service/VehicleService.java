package com.akml.vra.service;

import com.akml.vra.model.Vehicle;
import com.akml.vra.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAll() {
        return vehicleRepository.findAll();
    }

    public void create(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id)
                .orElse(null);
    }

    public void delete(Long id) {
        vehicleRepository.findById(id)
                .ifPresent(driver -> vehicleRepository.delete(driver));
    }
}
