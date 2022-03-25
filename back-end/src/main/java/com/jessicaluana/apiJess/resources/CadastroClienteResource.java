package com.jessicaluana.apiJess.resources;

import org.springframework.http.ResponseEntity;
import java.net.URI;
import java.util.List;

import com.jessicaluana.apiJess.services.CadastroClienteService;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "http://localhost:3000")
public class CadastroClienteResource {
	
		@Autowired
		private CadastroClienteService cadastroClienteService;

		@GetMapping
		public List<cadastroClienteservice> findAll() {
			return cadastroClienteService.findAll();
		}

        @PostMapping("/criar")
        public ResponseEntity<cadastroClienteService> save(@RequestBody CadastroClienteService cadastroClienteService) {
            cadastroClienteService.save(cadastroCliente);
            return ResponseEntity.ok().body(cadastroCliente);
        }

        @DeleteMapping("/deletar")
        public ResponseEntity<Void> delete(@PathVariable Integer id) {
            cadastroClienteService.delete(id);
            return ResponseEntity.noContent().build();
        }

        @PutMapping("/editar")
        public ResponseEntity<CadastroCliente> edit(@PathVariable Integer id,
                @RequestBody CadastroCliente cadastroCliente) {
            cadastroCliente = cadastroClienteService.edit(id, Nome);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(cadastroCliente.getId()).toUri();

            return ResponseEntity.created(uri).body(cadastroCliente);
        }

    }
}
