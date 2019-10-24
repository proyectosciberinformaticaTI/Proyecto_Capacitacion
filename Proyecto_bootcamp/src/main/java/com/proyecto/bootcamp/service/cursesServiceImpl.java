package com.proyecto.bootcamp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.bootcamp.bean.Curse;
import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.bean.Profesor;
import com.proyecto.bootcamp.repository.CurseReactiveRepository;
import com.proyecto.bootcamp.repository.ProfesorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class cursesServiceImpl implements cursesService{

	
	@Autowired
	private CurseReactiveRepository repo;
	
	
	@Autowired
	private ProfesorRepository prorepo;
	
	@Override
	public Mono<Curse> findByComplementName(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Curse> findByNumberidentify(String numberidentify) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Curse> findDateBirthbetween(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Curse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Curse> save(Curse parent) {
		// TODO Auto-generated method stub
		return repo.save(parent);
	}



	@Override
	public Mono<Profesor> findById(String id) {
		// TODO Auto-generated method stub
		return prorepo.findById(id);
	}

	@Override
	public Mono<Curse> delete(Curse parent) {
		// TODO Auto-generated method stub
		return null;
	}

}
