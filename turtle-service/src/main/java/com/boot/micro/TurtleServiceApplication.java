package com.boot.micro;

import com.boot.micro.model.Turtle;
import com.boot.micro.repositories.TurtleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
public class TurtleServiceApplication {

	@Bean
	CommandLineRunner runner(TurtleRepository repository){
		return args -> Arrays.asList(
                new Turtle("Jim", "Snapping Turtle", 40),
                new Turtle("Bob", "Terrapin Turtle", 30),
                new Turtle("Raph", "Box Turtle", 20),
                new Turtle("Donnie", "Slider Turtle", 10),
                new Turtle("Ninja", "Alligator Snapping Turtle", 1_000_000)
        ).forEach(repository::save);
	}
	public static void main(String[] args) {
		SpringApplication.run(TurtleServiceApplication.class, args);
	}
}
