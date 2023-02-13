package com.nttdata.services;

import java.util.List;
import java.util.Objects;

import com.nttdata.dao.TarjetaDAO;
import com.nttdata.domain.Tarjeta;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TarjetaServiceImpl implements TarjetaService{


	@Inject
	private TarjetaDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public void registrar(Tarjeta tarjeta) throws Exception {


		this.dao.persist(tarjeta);
	}
	/**
	 *
	 */
	@Override
	@Transactional
	public Tarjeta modificar(Long id,Tarjeta tarjeta) throws Exception {


		Tarjeta trj = this.dao.findById(id);

		if(Objects.isNull(trj.getIdTarjeta())) {
			throw new NullPointerException("Error, no se ha podido modificar");
		}


		this.dao.persist(trj);
		return trj;


	}
	/**
	 *
	 */
	@Override
	public List<Tarjeta> listar() throws Exception {

		return this.dao.findAll().list();
	}
	/**
	 *
	 */
	@Override
	public Tarjeta buscarPorId(Long id) throws Exception {

		return this.dao.findByIdOptional(id).orElse(null);
	}




}
