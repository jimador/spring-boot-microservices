package com.bootiful.learning.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by james on 2/16/2016.
 */
@Entity
@Data
public class Turtle {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;
    private Integer healthPoints;
}
