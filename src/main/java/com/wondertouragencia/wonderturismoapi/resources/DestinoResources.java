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

import com.wonderagencia.wonderturismoapi.entities.Destino;
import com.wonderagencia.wonderturismoapi.services.DestinoService;

@RestController
@RequestMapping("/destino")
@CrossOrigin (origins="*")
public class DestinoResources {
	
@Autowired
public DestinoService service;
	
@GetMapping
public List <Destino> findAll(){
return service.findAll();
}
		
@PostMapping (value="/")
public ResponseEntity <Destino> save(@RequestBody Destino destino){
service.save(destino);
return ResponseEntity.ok().body(destino);
}

@DeleteMapping(value="/{id_destino}")
public ResponseEntity<Destino> delete(@PathVariable Long id_destino){
service.delete(id_destino);
Destino destino = service.getById(id_destino);
return ResponseEntity.ok().body(destino);
}

@PutMapping(value = "/")
public ResponseEntity<Destino> update(@RequestBody Destino destino){
service.save(destino);
return ResponseEntity.ok().body(destino);
}	
}
