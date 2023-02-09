package com.nttdata.services;

import java.util.List;

import com.nttdata.dao.TipoTarjetaDAO;
import com.nttdata.domain.TipoTarjeta;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TipoTarjetaServiceImpl implements  ITipoTarjeta {

	@Inject
	private TipoTarjetaDAO dao;

	/**
	 *
	 */
	@Override
	public void registrar(TipoTarjeta tipoTarjeta) throws Exception {
		this.dao.persist(tipoTarjeta);

	}
	/**
	 *
	 */
	@Override
	public void modificar(TipoTarjeta tipoTarjeta) throws Exception {
		this.dao.persist(tipoTarjeta);

	}
	/**
	 *
	 */
	@Override
	public List<TipoTarjeta> listarTiposTarjeta() throws Exception {

		return this.dao.findAll().list();
	}

	@Override
	public TipoTarjeta buscarPorId(Integer id) throws Exception {

		return this.dao.findById(Long.valueOf(id));
	}

}
