package com.nttdata.services;

import java.util.List;

import com.nttdata.dao.ClienteDAO;
import com.nttdata.domain.Cliente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClienteServiceImpl implements IClienteService{


	@Inject
	private ClienteDAO dao;
	/**
	 *
	 */
	@Override
	public void registrar(Cliente cliente) throws Exception {

		this.dao.persist(cliente);
	}
	/**
	 *
	 */
	@Override
	public void modificar(Cliente cliente) throws Exception {
		this.dao.persist(cliente);
	}
	/**
	 *
	 */
	@Override
	public List<Cliente> listarCliente() throws Exception {

		return this.dao.findAll().list();
	}
	/**
	 *
	 */
	@Override
	public Cliente buscarPorId(Integer id) throws Exception {

		return this.dao.findById(Long.valueOf(id));
	}

	//	@Override
	//	public void eliminar(Integer id) throws Exception {
	//
	//
	//	Cliente cliente = new Cliente();
	//	if(Objects.nonNull(id)) {
	//
	//	LocalDateTime fcBaja =  LocalDateTime.now();
	//	cliente.set;
	//	}
	//	dao.persist(cliente);
	//
	//	}

}
