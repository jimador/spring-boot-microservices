package com.bootiful.learning.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by james on 2/16/2016.
 */
@RefreshScope
@RestController
public class TurtleRestController {
    @Value("${message}")
    private String message;

    @RequestMapping(value = "message")
    public String getMessage(){
        return this.message;
    }
}
