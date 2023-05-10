package com.akml.vra.controller;

import com.akml.vra.model.Reservation;
import com.akml.vra.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController extends AbstractController<Reservation> {

    @Autowired
    private ReservationService reservationService;

    @Override
    Reservation getEntityById(Long id) {
        return null;
    }

    @Override
    public List<Reservation> getAll() {
        return reservationService.getAll();
    }

    @Override
    void create(Reservation reservation) {

    }

    @Override
    void update(Long id, Reservation reservation) {

    }

    @Override
    void delete(Long id) {

    }
}
