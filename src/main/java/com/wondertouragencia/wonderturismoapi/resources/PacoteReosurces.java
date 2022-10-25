package com.wonderagencia.wonderturismoapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wonderagencia.wonderturismoapi.entities.Pacote;
import com.wonderagencia.wonderturismoapi.services.PacoteService;


@RestController
@RequestMapping("/pacote")
@CrossOrigin (origins="*")
public class PacoteReosurces {
	
@Autowired
public PacoteService service;
	
@GetMapping
public List <Pacote> findAll(){
return service.findAll();
}
		
@PostMapping (value="/")
public ResponseEntity <Pacote> save(@RequestBody Pacote pacote){
service.save(pacote);
return ResponseEntity.ok().body(pacote);
}


@DeleteMapping(value="/{id_pacote}")
public ResponseEntity<Pacote> delete(@PathVariable Long id_pacote){
service.delete(id_pacote);
Pacote pacote = service.getById(id_pacote);
return ResponseEntity.ok().body(pacote);
}

@PutMapping(value = "/")
public ResponseEntity<Pacote> update(@RequestBody Pacote pacote){
service.save(pacote);
return ResponseEntity.ok().body(pacote);
}	
}
