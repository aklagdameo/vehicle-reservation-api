package com.akml.vra.controller;

import com.akml.vra.model.Reservation;
import com.akml.vra.repository.ReservationRepository;
import com.akml.vra.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController extends AbstractController<Reservation, ReservationRepository> {

    @Autowired
    private ReservationService reservationService;
}
