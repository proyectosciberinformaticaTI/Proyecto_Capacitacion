package com.proyecto.bootcamp.web.test;

import static org.mockito.Mockito.times;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.util.ResourceUtils;
import org.springframework.web.reactive.function.BodyInserters;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;

import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.repository.ItemReactiveRepository;
import com.proyecto.bootcamp.service.parentsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;




@AutoConfigureWebTestClient
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {ItemReactiveRepository.class, parentsService.class})
public class Testcontrollerunit {
	
	
	ObjectMapper mapper;

	@Autowired
	WebTestClient webTestClient;

	@MockBean
	private parentsService parentsService;

	@BeforeEach
	public void init() {
//		webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();

		mapper = new ObjectMapper();
	}

	@Test
	public void testCreateParents() {
        Parents parent = new Parents();
        parent.set_id("4667485");
        parent.setComplementName("Test");
   
        parent.setNumberidentify("35535");
        parent.setSex("H");
        parent.setTypeidentify("DNI");
        Mockito.when(parentsService.save(parent)).thenReturn(Mono.just(parent));
 
        webTestClient.post()
            .uri("/index/create")
            .contentType(MediaType.APPLICATION_JSON)
            .body(BodyInserters.fromObject(parent))
            .exchange()
            .expectStatus().isCreated();
 
     
	}

	@Test
	public void testGetParents() {


		webTestClient.get().uri("/index/listall").accept(MediaType.APPLICATION_JSON_UTF8)
		.exchange()
		.expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
		.expectBodyList(Parents.class)
		.consumeWith(response -> {
			List<Parents> list = response.getResponseBody();
			list.forEach(p -> {
				System.out.println(p.getComplementName());
			});
			
			Assertions.assertThat(list.size()>0).isTrue();
		});

	}

	
	
	
	
	
	

}
