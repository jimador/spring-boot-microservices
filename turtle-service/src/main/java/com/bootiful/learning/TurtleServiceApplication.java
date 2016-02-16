package com.bootiful.learning;

import com.bootiful.learning.model.Turtle;
import com.bootiful.learning.repositories.TurtleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class TurtleServiceApplication {

	@Bean
	CommandLineRunner runner(TurtleRepository repository){
		return args -> Arrays.asList(
                new Turtle("Jim", "Snapper", 40),
                new Turtle("Bob", "Terrapin", 30),
                new Turtle("Raph", "Box", 20),
                new Turtle("Donnie", "Slider", 10)
        ).forEach(repository::save);
	}
	public static void main(String[] args) {
		SpringApplication.run(TurtleServiceApplication.class, args);
	}
}
