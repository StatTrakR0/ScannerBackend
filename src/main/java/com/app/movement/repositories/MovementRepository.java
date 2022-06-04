package com.app.movement.repositories;

import com.app.movement.entities.Movement;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MovementRepository extends JpaRepository<Movement, Long>{}