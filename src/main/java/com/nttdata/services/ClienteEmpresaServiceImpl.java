package com.nttdata.services;

import java.util.List;

import com.nttdata.dao.ClienteEmpresaDAO;
import com.nttdata.domain.ClienteEmpresa;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClienteEmpresaServiceImpl implements IClienteEmpresaService{



	@Inject
	private ClienteEmpresaDAO dao;


	/**
	 *
	 */

	@Override
	public void registrar(ClienteEmpresa empresa) throws Exception {

		this.dao.persist(empresa);
	}
	/**
	 *
	 */
	@Override
	public void modificar(ClienteEmpresa empresa) throws Exception {
		this.dao.persist(empresa);
	}
	/**
	 *
	 */
	@Override
	public List<ClienteEmpresa> listarEmpresa() throws Exception {

		return this.dao.findAll().list();
	}

	@Override
	public ClienteEmpresa buscarPorId(Integer id) throws Exception {

		return this.dao.findById(Long.valueOf(id));
	}

	//	@Override
	//	public void eliminar(Integer id) throws Exception {
	//		ClienteEmpresa clienteEmpresa =  new ClienteEmpresa();
	//
	//		if(Objects.nonNull(id)) {
	//			LocalDateTime fcBaja =  LocalDateTime.now();
	//			clienteEmpresa.setFcBajaFila(fcBaja);}
	//
	//		this.dao.persist(clienteEmpresa);
	//
	//	}

}
