package com.akml.vra.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

abstract class AbstractController<Entity> {

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    abstract Entity getEntityById(Long id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    abstract List<Entity> getAll();

    @PostMapping
    abstract void create(Entity entity);

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    abstract void update(Long id, Entity entity);

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    abstract void delete(Long id);
}
