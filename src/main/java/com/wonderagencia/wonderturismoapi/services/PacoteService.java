package com.wonderagencia.wonderturismoapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wonderagencia.wonderturismoapi.entities.Pacote;
import com.wonderagencia.wonderturismoapi.repositories.PacoteRepository;


@Service
public class PacoteService {
	@Autowired
	private PacoteRepository repository;

@Transactional(readOnly= true)
	public List <Pacote> findAll(){
		List<Pacote> resultado = repository.findAll();
		return resultado;	
}
public Pacote getById(Long id_pacote){
 Optional<Pacote> pacote = repository.findById(id_pacote);
 if(pacote.isPresent()) {
	 return pacote.get();
 }else {
	 return null;
 }
}

public void save(Pacote pacote) {
	try {
repository.save(pacote);
	}catch (Exception ex) {
	throw ex;
	}
}

public void delete(Long id_pacote) {
Optional<Pacote> pacote = repository.findById(id_pacote);
if (pacote.isPresent()) {
	repository.delete(pacote.get());
	System.out.println(pacote.get().getNomepacote());	
}else {
	System.out.println("Esse pacote não está cadastrado");
	}
}

public void update(Pacote pacote) {
	try {
		repository.save(pacote);
	}catch(Exception ex) {
		throw ex;
	}
}
	}
