package com.proyecto.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.bootcamp.bean.Profesor;

@Repository
public interface ProfesorRepository extends ReactiveMongoRepository<Profesor, String>{

}
