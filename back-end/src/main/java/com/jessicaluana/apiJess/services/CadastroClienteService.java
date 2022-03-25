package com.jessicaluana.apiJess.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.agenciaSpring.entities.Cliente;
import com.recode.agenciaSpring.repositories.ClienteRepository;

@Service
public class CadastroClienteService {

	@Autowired
	CadastroClienteService repository;

	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		List<Cliente> result = repository.findAll();
		return result;
	}
	
	@Transactional(readOnly = true)
	public Optional<Cliente> findById(Long id) {
		return repository.findById(id);
	}

	@Transactional(readOnly = true)
	public Cliente create(Cliente cliente) {
		return repository.save(cliente);
	}

	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}