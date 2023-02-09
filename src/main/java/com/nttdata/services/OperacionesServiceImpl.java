package com.nttdata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.hibernate.service.spi.ServiceException;

import com.nttdata.dao.OperacionesDAO;
import com.nttdata.domain.Operaciones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class OperacionesServiceImpl implements IOperacionesService{


	@Inject
	private OperacionesDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public void registrar(Operaciones transaccion) throws Exception {

		if(Objects.nonNull(transaccion)) {

			LocalDateTime fcActual = LocalDateTime.now();

			transaccion.setFcAltaFila(fcActual);
			this.dao.persist(transaccion);

		}

	}
	/**
	 *
	 */
	@Override
	public void modificar(Operaciones operaciones) throws Exception {

		if (Objects.isNull(operaciones.getIdOperacion())) {
			throw new ServiceException("Error al encontrar el id");
		}

		LocalDateTime fcActual = LocalDateTime.now();

		operaciones.setFcModifFila(fcActual);
		this.dao.persist(operaciones);


	}
	/**
	 *
	 */
	@Override
	public List<Operaciones> listarTransaccion() throws Exception {

		return this.dao.findAll().list();
	}


	/**
	 *
	 */
	@Override
	public void eliminar(Integer id) throws Exception {

		Operaciones transaccion = new Operaciones();

		if(Objects.nonNull(id)) {
			LocalDateTime fcBaja =  LocalDateTime.now();
			transaccion.setFcBajaFila(fcBaja);}

		this.dao.persist(transaccion);



	}
	/**
	 *
	 */
	@Override
	public Operaciones buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}

}
