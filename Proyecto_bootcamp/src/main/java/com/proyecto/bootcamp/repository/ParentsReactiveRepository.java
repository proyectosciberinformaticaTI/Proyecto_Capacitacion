package com.proyecto.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.bean.Students;

@Repository
public interface ParentsReactiveRepository extends ReactiveMongoRepository<Students,String>{

}
