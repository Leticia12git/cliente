package com.br.clientes.clientes.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.clientes.clientes.model.Cliente;
import com.br.clientes.clientes.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
    

  	private final ClienteRepository clienteRepository;



	/**
	 * metodo que busca todos os clientes
	 * 
	 * @return List</Cliente>
	 */
	public Page<Cliente> findAllCliente(Pageable pageable) {
		return clienteRepository.findAll(pageable);
	}


	/**
	 * metodo que busca um cliente por id
	 *
	 * @param id
	 * @return
	 */
	public Optional<Cliente> findById(Long id) {

		return clienteRepository.findById(id);
	}


	/**
	 * metodo que cadastra um cliente
	 *
	 * @return cliente
	 */
	@Transactional(rollbackFor = Exception.class)
	public Cliente cadastrarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	/**
	 * @param
	 * @return
	 */
	public Cliente atualizarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	/**
	 *
	 * @param id
	 * @return Cliente
	 */
	public void deletarCliente(Long id ) {
		  clienteRepository.deleteById(id);
	}
}
