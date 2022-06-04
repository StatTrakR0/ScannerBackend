package com.app.movement.controllers;

import com.app.movement.entities.Movement;
import com.app.movement.repositories.MovementRepository;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MovementController {

    private final MovementRepository movementRepository;

    public MovementController(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    @GetMapping("/movements")
    public List<Movement> getMovements() {
        return (List<Movement>) movementRepository.findAll();
    }

    @PostMapping("/movements/addnew")
    void addMovement(@RequestBody Movement movement) {
        movementRepository.save(movement);
    }

    @PutMapping("/movements/{id}/edit")
    public void updateMovement(@PathVariable("id") Long id, @RequestBody Movement movement){
        movementRepository.save(movement);
    }

    @DeleteMapping("/movements/{id}/delete")
    public void deleteMovement(@PathVariable("id") Long id){
        movementRepository.deleteById(id);
    }
}