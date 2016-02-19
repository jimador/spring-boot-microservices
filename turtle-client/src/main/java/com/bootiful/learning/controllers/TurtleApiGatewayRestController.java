package com.bootiful.learning.controllers;

import com.bootiful.learning.model.Turtle;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by james on 2/19/2016.
 */
@RestController
@RequestMapping(value = "/turtles")
public class TurtleApiGatewayRestController {

    @Autowired
    private RestTemplate restTemplate;

    public Collection<String> turtleNameFallback(){
        return new ArrayList<>();
    }


    @HystrixCommand(fallbackMethod = "turtleNameFallback")
    @RequestMapping(value = "/names", method = RequestMethod.GET)
    public Collection<String> turtleNames(){
        ParameterizedTypeReference<Resources<Turtle>> turtle = new ParameterizedTypeReference<Resources<Turtle>>() {};

        return this.restTemplate
                .exchange("http://turtle-service/turtles", HttpMethod.GET, null, turtle)
                .getBody()
                .getContent()
                .stream()
                .map(Turtle::getTurtleName)
                .collect(Collectors.toList());
    }
}
