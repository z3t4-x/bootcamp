package com.nttdata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.hibernate.service.spi.ServiceException;

import com.nttdata.dao.PagoCreditoDAO;
import com.nttdata.domain.PagoCredito;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PagoCreditoServiceImpl implements PagoCreditoService{


	@Inject
	private PagoCreditoDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public void registrar(PagoCredito pagoCredito) throws Exception {


		LocalDateTime fcActual = LocalDateTime.now();
		pagoCredito.setFcInicio(fcActual);

		this.dao.persist(pagoCredito);


	}
	/**
	 *
	 */
	@Override
	public void modificar(Long id, PagoCredito pagoCredito) throws Exception {

		PagoCredito pgCredito =  this.dao.findById(id);

		if (Objects.isNull(pgCredito.getIdPagoCredito())) {
			throw new ServiceException("Error al editar, no se encontró el id: " + pagoCredito.getIdPagoCredito());
		}

		LocalDateTime fcActual = LocalDateTime.now();
		pgCredito.setFcInicio(fcActual);
		pgCredito.setFcInicio(pagoCredito.getFcInicio());
		pgCredito.setNmCuotas(pagoCredito.getNmCuotas());
		pgCredito.setSaldoActual(pagoCredito.getSaldoActual());
		pgCredito.setFcPagoMensual(pagoCredito.getFcPagoMensual());

		this.dao.persist(pgCredito);


	}
	/**
	 *
	 */
	@Override
	public List<PagoCredito> listarPagoCredito() throws Exception {

		return this.dao.findAll().list();
	}



	/**
	 *
	 */
	@Override
	public PagoCredito buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}

}
