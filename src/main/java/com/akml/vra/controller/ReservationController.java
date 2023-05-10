package com.akml.vra.controller;

import com.akml.vra.model.Reservation;
import com.akml.vra.repository.ReservationRepository;
import com.akml.vra.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@RestController
@RequestMapping("/reservations")
public class ReservationController extends AbstractController<Reservation, ReservationRepository> {

    @Autowired
    private ReservationService reservationService;

    @Override
    public void create(@RequestBody Reservation reservation) {
        if (Objects.equals(reservation.getStartDate(), reservation.getEndDate())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Start Date should not be the same as End Date.");
        }
        reservationService.createReservation(reservation);
    }
}
