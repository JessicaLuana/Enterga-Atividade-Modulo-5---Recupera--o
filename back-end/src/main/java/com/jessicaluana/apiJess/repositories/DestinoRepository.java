package com.jessicaluana.apiJess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jessicaluana.apiJess.entities.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Integer> {

}
