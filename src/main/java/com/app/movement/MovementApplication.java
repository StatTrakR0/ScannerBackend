package com.app.movement;

import com.app.movement.entities.Movement;
import com.app.movement.repositories.MovementRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class MovementApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovementApplication.class, args);
	}

	@Bean
	CommandLineRunner init(MovementRepository movementRepository) {
		return args -> {
			Stream.of(1, 2, 3).forEach(num -> {
				Movement movement = new Movement(num, num+10, num+10, num+10);
				movementRepository.save(movement);
			});
			movementRepository.findAll().forEach(System.out::println);
		};
	}
}
