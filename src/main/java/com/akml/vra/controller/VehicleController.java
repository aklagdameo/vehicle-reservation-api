package com.akml.vra.controller;

import com.akml.vra.model.Vehicle;
import com.akml.vra.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController extends AbstractController<Vehicle> {

    @Autowired
    private VehicleService vehicleService;

    @Override
    public List<Vehicle> getAll() {
        return vehicleService.getAll();
    }

    @Override
    public void create(@RequestBody Vehicle vehicle) {
        vehicleService.create(vehicle);
    }

    @Override
    void update(Long id, Vehicle vehicle) {

    }

    @Override
    public Vehicle getEntityById(@PathVariable("id") Long id) {
        return vehicleService.getVehicleById(id);
    }

    @Override
    public void delete(@PathVariable("id") Long id) {
        vehicleService.delete(id);
    }
}
