package com.akml.vra.controller;

import com.akml.vra.model.Driver;
import com.akml.vra.repository.DriverRepository;
import com.akml.vra.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController extends AbstractController<Driver, DriverRepository> {

    @Autowired
    private DriverService driverService;
}
