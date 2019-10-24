package com.proyecto.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Repository;

import com.proyecto.bootcamp.bean.Curse;
import com.proyecto.bootcamp.bean.Parents;

@Repository
public interface CurseReactiveRepository extends ReactiveMongoRepository<Curse,String>{

}
