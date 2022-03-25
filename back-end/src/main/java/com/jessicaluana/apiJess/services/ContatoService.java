package com.jessicaluana.apiJess.services;

import java.util.List;
import java.util.Optional;

import com.jessicaluana.apiJess.entities.Contato;
import com.jessicaluana.apiJess.repositories.ContatoRepository;
import com.jessicaluana.apiJess.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContatoService {
	@Autowired
	private ContatoRepository contatoRepository;

	@Transactional(readOnly = true)
	public List<Contato> findAll() {
		List<Contato> contato = contatoRepository.findAll();
		return contato;
	}

	@Transactional(readOnly = true)
	public Contato findById(Integer id) {
		Optional<Contato> contato = contatoRepository.findOne(id);
		return contato.orElseThrow(() -> new RuntimeException("Não foi encontrado esse contato"));
	}

	@Transactional
	public void salvar(Contato contato) {
		contatoRepository.save(contato);
	}

	@Transactional
	public void deletar(Integer id) {
		try {
			contatoRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Contato não existe.");
		}

	@Transactional
	public Contato editar(Integer id, Contato contato) {
		Contato contatoEditar = contatoRepository.findById(id);

		contatoEditar.setNome(contato.getNome());
		contatoEditar.setEmail(contato.getEmail());
		contatoEditar.setMensagem(contato.getMensagem());

		contatoEditar = contatoRepository.save(contatoEditar);

		return new Contato();

	}
}
