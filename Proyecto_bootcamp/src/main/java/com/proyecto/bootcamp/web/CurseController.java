package com.proyecto.bootcamp.web;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Date;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.proyecto.bootcamp.bean.Curse;
import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.bean.Profesor;
import com.proyecto.bootcamp.bean.Students;
import com.proyecto.bootcamp.service.curseServiceImpl2;
import com.proyecto.bootcamp.service.cursesServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;




@RestController
@RequestMapping("/curse")
@Api(value = "REGISTER FAMILY")
public class CurseController {

	@Autowired
	private cursesServiceImpl service;

	
	@Autowired
	private curseServiceImpl2 service2;
	
	
	private static final Logger log = LoggerFactory.getLogger(CurseController.class);


	@PostMapping(value = "/create")
	@ApiOperation(value = "CREATE  REGISTER CURSE", response = Parents.class, httpMethod = "GET")
	@ApiResponses({ @ApiResponse(code = 200, message = "Se ejecuto satisfactoriamente.", response = Curse.class),
			@ApiResponse(code = 400, message = "Envio datos incorrectos.", response = ExceptionInInitializerError.class),
			@ApiResponse(code = 404, message = "No existe una entidad con ese ID.", response = ExceptionInInitializerError.class),
			@ApiResponse(code = 500, message = "Error inesperado.", response = ExceptionInInitializerError.class) })
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Curse> guardar(@Valid @RequestBody Curse curse) {
//		int contador = 0;
//		for (int i = 0; i < resultado.getParents().size(); i++) {
//			if (resultado.getParents().get(i).getRelacion().equals("padre")
//					|| resultado.getParents().get(i).getRelacion().equals("madre")) {
//				contador++;
//
//			}
//		}
//		
//		
//		
//		for (int i = 0; i < request.getParents().size(); i++) {
//		
//			if(request.getParents())
//			
//			
//			Mono<Students> categoria = servicepa.findById(request.getParents().get(i).get_id());
//		}
//		return cate
//		
//		Map<String, Object> respuesta = new HashMap<String, Object>();
//		return request.flatMap(resultado -> {
//
//	
//
////					List<Students> stpa = (List<Students>) servicepa.findById(resultado.getParents().get(contador).get_id());
//
//					return service.save(resultado).map(p -> {
//
////						int contador2 = 0;
////						for (int i = 0; i < resultado.getParents().size(); i++) {
////							if (resultado.getParents().get(i).getRelacion().equals("padre")
////									|| resultado.getParents().get(i).getRelacion().equals("madre")) {
////								contador2++;
////
////							}
////						}
////						
////				//		p.setParents(stpa);
////						resultado.setStpar(p.getParents().get(contador2));
//						respuesta.put("parents", p);
//						respuesta.put("mensaje", "Curse creado con éxito");
//						respuesta.put("timestamp", new Date());
//						return ResponseEntity.created(URI.create("/index/".concat(p.get_id())))
//								.contentType(MediaType.APPLICATION_JSON_UTF8).body(respuesta);
//
//					});
//
//		});		
               

			Mono<Profesor> profesor = service.findById(curse.getProfesor().get_id());
            
			int contador2 = 0;
		for (int i = 0; i < curse.getStudents().size(); i++) {
			if (curse.getStudents().get(i).get_id().toString() != null) {
			contador2++;

		}
	}
           Flux.fromIterable(curse.getStudents());
	
	
			
			
			return profesor.flatMap(c -> {
		
				
				
				
				
				
				
				
				       curse.getProfesor().setNombre(c.getNombre());
		                 curse.getProfesor().setDni(c.getDni());
						curse.setProfesor(c);
							
				
					
				
				return service.save(curse);
			
			});
					
			
	
			
			
			
		}
	
	

	

}
