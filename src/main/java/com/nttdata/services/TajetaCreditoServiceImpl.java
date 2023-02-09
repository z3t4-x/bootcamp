package com.nttdata.services;

import java.util.List;

import com.nttdata.dao.TarjetaCreditoDAO;
import com.nttdata.domain.TarjetaCredito;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TajetaCreditoServiceImpl implements ITarjetaCredito {

	@Inject
	private TarjetaCreditoDAO dao;

	/**
	 *
	 */
	@Override
	public void registrar(TarjetaCredito tarjetaCredito) throws Exception {
		this.dao.persist(tarjetaCredito);

	}
	/**
	 *
	 */
	@Override
	public void modificar(TarjetaCredito tarjetaCredito) throws Exception {
		this.dao.persist(tarjetaCredito);

	}
	/**
	 *
	 */
	@Override
	public List<TarjetaCredito> listarTarjetaCredito() throws Exception {

		return this.dao.findAll().list();
	}
	/**
	 *
	 */
	@Override
	public TarjetaCredito buscarPorId(Integer id) throws Exception {

		return this.dao.findById(Long.valueOf(id));
	}

}
