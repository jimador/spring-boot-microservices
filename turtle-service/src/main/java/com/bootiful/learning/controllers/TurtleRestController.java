package com.bootiful.learning.controllers;

import com.bootiful.learning.model.Turtle;
import com.bootiful.learning.repositories.TurtleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by james on 2/16/2016.
 */
@RestController
@Slf4j
public class TurtleRestController {

    private final TurtleRepository turtleRepository;

    @Autowired
    public TurtleRestController(TurtleRepository turtleRepository){
        this.turtleRepository = turtleRepository;
    }

    @RequestMapping(value = "turtles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> findAllTurtles(){
        log.info("Finding all of the turtles!");
        return turtleRepository
                .findAll()
                .stream()
                .map(Turtle::getTurtleName)
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "turtles/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<Turtle> findTurtle(@PathVariable(value = "name") String name){
        return turtleRepository.findByTurtleName(name);
    }


}
