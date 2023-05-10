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
}
