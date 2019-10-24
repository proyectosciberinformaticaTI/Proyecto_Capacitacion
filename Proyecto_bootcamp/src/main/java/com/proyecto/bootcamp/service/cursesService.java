package com.proyecto.bootcamp.service;

import java.util.Date;

import com.proyecto.bootcamp.bean.Curse;
import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.bean.Profesor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface cursesService {

	
	Mono<Curse> findByComplementName(String nombre);
	
	Mono<Curse> findByNumberidentify(String numberidentify);
	
 Flux<Curse> findDateBirthbetween(Date startDate, Date endDate);
	
 Flux<Curse> findAll();
	
	
	Mono<Curse> save(Curse parent);
	


    Mono<Curse> delete(Curse parent);
    
   Mono<Profesor> findById(String id);
	

	
	
}
