package com.nttdata.services;

import java.util.List;

import com.nttdata.dao.TarjetaDebitoDAO;
import com.nttdata.domain.TarjetaDebito;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TarjetaDebitoServiceImpl implements ITarjetaDebito{



	@Inject
	private TarjetaDebitoDAO dao;



	/**
	 *
	 */
	@Override
	public void registrar(TarjetaDebito tarjetaDebito) throws Exception {
		this.dao.persist(tarjetaDebito);

	}
	/**
	 *
	 */
	@Override
	public void modificar(TarjetaDebito tarjetaDebito) throws Exception {
		this.dao.persist(tarjetaDebito);

	}

	/**
	 *
	 */
	@Override
	public List<TarjetaDebito> listarTarjetaDebito() throws Exception {

		return this.dao.findAll().list();
	}


	/**
	 *
	 */
	@Override
	public TarjetaDebito buscarPorId(Integer id) throws Exception {

		return this.dao.findById(Long.valueOf(id));
	}

}
