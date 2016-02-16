package com.bootiful.learning.repositories;

import com.bootiful.learning.model.Turtle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by james on 2/16/2016.
 */
@Repository
public interface TurtleRepository extends JpaRepository<Turtle, Long>{
    Collection<Turtle> findByTurtleName(@Param("name") String name);
}
