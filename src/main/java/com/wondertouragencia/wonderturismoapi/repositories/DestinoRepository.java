package com.wonderagencia.wonderturismoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wonderagencia.wonderturismoapi.entities.Destino;


@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {

}