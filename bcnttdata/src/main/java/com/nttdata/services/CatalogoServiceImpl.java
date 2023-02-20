package com.nttdata.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.dao.CatalogosDAO;
import com.nttdata.domain.Catalogos;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CatalogoServiceImpl implements CatalogosService{


	@Inject
	private CatalogosDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public void registrar(Catalogos catalogos) throws Exception {


		this.dao.persist(catalogos);
	}
	/**
	 *
	 */
	/* @Override
	@Transactional
	public Catalogos modificar(Long id, Catalogos catalogos) throws Exception {


		Optional<Catalogos> cliOp = Optional.of(this.dao.findById(id));

		if(Objects.isNull(cliOp)) {
			throw new NullPointerException("Error, no se ha podido modificar");
		}


		this.dao.persist(catalogos);
		return catalogos;


	} */
	/**
	 *
	 */
	@Override
	public List<Catalogos> listar() throws Exception {

		return this.dao.findAll().list();
	}
	/**
	 *
	 */
	/* @Override
	public Catalogos buscarPorId(Long id) throws Exception {

		return this.dao.findByIdOptional(id).orElse(null);
	} */

	/**
	 *
	 */
/* 	@Override
	public void modificar2(Catalogos catalogos) throws Exception {


		Optional<Catalogos> cliOp = Optional.of(this.dao.findById(catalogos.getIdCatalogo()));

		if(Objects.isNull(cliOp)) {
			throw new NullPointerException("Error, no se ha podido modificar");
		}

		this.dao.persist(catalogos);

	} */


}
