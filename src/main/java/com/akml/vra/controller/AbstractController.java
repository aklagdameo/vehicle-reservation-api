package com.akml.vra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

abstract class AbstractController<Entity, EntityRepository> {

    @Autowired
    public JpaRepository<Entity, Long> entityRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Entity> getAll() {
        return entityRepository.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    Optional<Entity> getEntityById(@PathVariable("id") Long id) {
        return entityRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void create(@RequestBody Entity entity) {
        entityRepository.save(entity);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable("id") Long id, @RequestBody Entity entity) {
        if (!entityRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity does not exist.");
        }
        entityRepository.save(entity);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable("id") Long id) {
        if (!entityRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity does not exist.");
        }
        entityRepository.deleteById(id);
    }
}
