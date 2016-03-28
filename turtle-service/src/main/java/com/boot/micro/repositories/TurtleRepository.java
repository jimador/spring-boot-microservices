package com.boot.micro.repositories;

import com.boot.micro.model.Turtle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by james on 2/16/2016.
 */
@Repository
@RepositoryRestResource
public interface TurtleRepository extends JpaRepository<Turtle, Long>{
    @RestResource(path = "all-turtles")
    Collection<Turtle> findByTurtleName(@Param("name") String name);
}
