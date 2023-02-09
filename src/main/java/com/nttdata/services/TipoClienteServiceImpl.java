package com.nttdata.services;

import java.util.List;

import com.nttdata.dao.TipoClienteDAO;
import com.nttdata.domain.TipoCliente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TipoClienteServiceImpl implements ITipoClienteService{


	@Inject
	private TipoClienteDAO dao;

	/**
	 *
	 */
	@Override
	public void registrar(TipoCliente tipoCliente) throws Exception {
		this.dao.persist(tipoCliente);

	}
	/**
	 *
	 */
	@Override
	public void modificar(TipoCliente tipoCliente) throws Exception {

		this.dao.persist(tipoCliente);

	}
	/**
	 *
	 */
	@Override
	public List<TipoCliente> listarTiposCliente() throws Exception {

		return this.dao.findAll().list();
	}
	/**
	 *
	 */
	@Override
	public TipoCliente buscarPorId(Integer id) throws Exception {

		return this.dao.findById(Long.valueOf(id));
	}
	/**
	 *
	 */
	@Override
	public void eliminar(Integer id) throws Exception {

		this.dao.deleteById(Long.valueOf(id));

	}

}
