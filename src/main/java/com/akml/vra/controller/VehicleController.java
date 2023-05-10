package com.akml.vra.controller;

import com.akml.vra.model.Vehicle;
import com.akml.vra.repository.VehicleRepository;
import com.akml.vra.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController extends AbstractController<Vehicle, VehicleRepository> {

    @Autowired
    private VehicleService vehicleService;
}
