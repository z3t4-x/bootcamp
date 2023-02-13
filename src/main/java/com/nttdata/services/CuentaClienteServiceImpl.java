package com.nttdata.services;

import java.util.List;

import com.nttdata.dao.CuentaClienteDAO;
import com.nttdata.domain.CuentaCliente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CuentaClienteServiceImpl implements CuentaClienteService{


	@Inject
	private CuentaClienteDAO dao;

	/**
	 *
	 */
	@Override
	public List<CuentaCliente> listarCuentaCliente() throws Exception {

		return this.dao.findAll().list();
	}





}
