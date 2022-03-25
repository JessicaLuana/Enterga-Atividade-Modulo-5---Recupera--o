package com.jessicaluana.apiJess.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jessicaluana.apiJess.entities.Destino;
import com.jessicaluana.apiJess.repositories.DestinoRepository;
import com.jessicaluana.apiJess.services.exceptions.ResourceNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;

@Service
public class DestinoService {

	@Autowired
	private DestinoRepository destinoRepository;

	@Transactional(readOnly = true)
	public List<Destino> findAll() {
		List<Destino> destino = destinoRepository.findAll();
		return destino;
	}

	@Transactional(readOnly = true)
	public Destino findById(Integer id) {
		Optional<Destino> destino = destinoRepository.findOne(id);
		return destino.orElseThrow(() -> new RuntimeException("Não foi encontrado esse contato"))

	public void salvar(Destino Destino) {
		destinoRepository.save(Destino);
	}

	@Transactional
	public void deletar(Integer id) {
		try {
			destinoRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Destino não existe.");
		}

	@Transactional
	public Destino editar(Integer id, Destino destino) {
		Destino destinoEditar = destinoRepository.findById(id);

		destinoEditar.setNome(destino.getNome());
		destinoEditar.setEmail(destino.getEmail());
		destinoEditar.setDestino(destino.getDestino());
		destinoEditar.setValor(destino.getValor());

		destinoEditar = destinoRepository.save(destinoEditar);

		return new Destino();

	}
}
