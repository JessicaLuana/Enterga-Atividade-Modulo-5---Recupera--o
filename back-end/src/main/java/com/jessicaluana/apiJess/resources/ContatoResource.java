package com.jessicaluana.apiJess.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jessicaluana.apiJess.entities.Contato;
import com.jessicaluana.apiJess.services.ContatoService;

@RestController
@RequestMapping("/contato")
@CrossOrigin(origins = "http://localhost:3000")
public class ContatoResource {

		@Autowired
		private ContatoService service;

		@GetMapping
		public List<Contato> findAll() {
			return service.findAll();
		}
		
		@PostMapping("/criar")
        public ResponseEntity<Contato> save(@RequestBody Contato contato) {
            contatoService.save(contato);
            return ResponseEntity.ok().body(contato);
        }

        @DeleteMapping("/deletar")
        public ResponseEntity<Void> delete(@PathVariable Integer id) {
            contatoService.delete(id);
            return ResponseEntity.noContent().build();
        }

        @PutMapping("/editar")
        public ResponseEntity<Contato> edit(@PathVariable Integer id, @RequestBody Contato contato) {
            contato = contatoService.edit(id, Nome);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(contato.getId())
                    .toUri();

            return ResponseEntity.created(uri).body(contato);
        }

    }

}
