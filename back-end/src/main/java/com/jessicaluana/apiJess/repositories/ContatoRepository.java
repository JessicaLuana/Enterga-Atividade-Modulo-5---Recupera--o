package com.jessicaluana.apiJess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.jessicaluana.apiJess.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{

    Optional<Contato> findOne(Integer id);

}
