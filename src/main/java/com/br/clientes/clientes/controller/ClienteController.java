package com.br.clientes.clientes.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.br.clientes.clientes.model.Cliente;
import com.br.clientes.clientes.service.ClienteService;

/**
 * Classe com os endpoints da aplicação
 * @author Leticia Lima
 */
@RestController
@Controller
public class ClienteController {

	@Autowired
	ClienteService clienteService;


	@GetMapping("/findAll")
	public Page<Cliente> findAllCliente(Pageable pageable) {
		return clienteService.findAllCliente(pageable);
	}

	@GetMapping("/findById/{id}")
	public Optional<Cliente> findById(@PathVariable(value = "id") Long id) {
		return clienteService.findById(id);
	}

	@PostMapping(value = "/cadastrarCliente")
	public Optional<Cliente> cadastrarCliente(@Valid @RequestBody Cliente cliente) {
		return Optional.ofNullable(clienteService.cadastrarCliente(cliente));
	}
	@PutMapping(value = "/atualizarCliente/{id}")
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return  clienteService.atualizarCliente(cliente);
	}

	@DeleteMapping(value = "/{id}")
	public void deletarCliente(@PathVariable(value = "id") Long id) {
		 clienteService.deletarCliente(id);
	}
}























































































































































