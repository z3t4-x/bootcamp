package com.nttdata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.dao.CatalogosValoresDAO;
import com.nttdata.domain.CatalogosValores;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CatalogosValoresServiceImpl implements CatalogosValoresService{


	@Inject
	private CatalogosValoresDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public void registrar(CatalogosValores catalogosValores) throws Exception {

		LocalDateTime fcHoy =  LocalDateTime.now();
		String cdUsuAlta = "Admin";
		catalogosValores.setCdUsuAlta(cdUsuAlta);
		catalogosValores.setFcAltaFila(fcHoy);

		this.dao.persist(catalogosValores);
	}
	/**
	 *
	 */
	@Override
	@Transactional
	public CatalogosValores modificar(Long id, CatalogosValores catalogosValores) throws Exception {


		Optional<CatalogosValores> cliOp = Optional.of(this.dao.findById(id));

		if(Objects.isNull(cliOp)) {
			throw new NullPointerException("Error, no se ha podido modificar");
		}


		this.dao.persist(catalogosValores);
		return catalogosValores;


	}
	/**
	 *
	 */
	@Override
	public List<CatalogosValores> listar() throws Exception {

		return this.dao.findAll().list();
	}
	/**
	 *
	 */
	@Override
	public CatalogosValores buscarPorId(Long id) throws Exception {

		return this.dao.findByIdOptional(id).orElse(null);
	}

	/**
	 *
	 */
	@Override
	public void modificar2(CatalogosValores catalogosValores) throws Exception {


		Optional<CatalogosValores> cliOp = Optional.of(this.dao.findById(catalogosValores.getIdValor()));

		if(Objects.isNull(cliOp)) {
			throw new NullPointerException("Error, no se ha podido modificar");
		}

		this.dao.persist(catalogosValores);

	}


}
