package com.boot.micro.rest;

import com.boot.micro.repositories.TurtleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by james on 2/16/2016.
 */
@RefreshScope
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TurtleRestController {

    private final TurtleRepository turtleRepository;

    @Value("${message}")
    private String message;

    @RequestMapping(value = "message")
    public String getMessage(){
        return this.message;
    }
}
