package com.akml.vra.controller;

import com.akml.vra.model.Driver;
import com.akml.vra.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController extends AbstractController<Driver> {

    @Autowired
    private DriverService driverService;

    @Override
    public List<Driver> getAll() {
        return driverService.getAllDrivers();
    }

    @Override
    public void create(@RequestBody Driver driver) {
        driverService.create(driver);
    }

    @Override
    public Driver getEntityById(@PathVariable("id") Long id) {
        return driverService.getDriverById(id);
    }

    @Override
    void update(Long id, Driver driver) {

    }

    @Override
    public void delete(@PathVariable("id") Long id) {
        driverService.delete(id);
    }
}
