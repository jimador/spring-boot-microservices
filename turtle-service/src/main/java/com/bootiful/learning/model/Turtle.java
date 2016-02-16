package com.bootiful.learning.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by james on 2/16/2016.
 */
@Entity
@Data
@NoArgsConstructor
public class Turtle {
    @Id
    @GeneratedValue
    private Long id;

    private String turtleName;
    private String type;
    private Integer hp;

    public Turtle(String name, String type, Integer hp) {
        this.turtleName = name;
        this.type = type;
        this.hp = hp;
    }
}
