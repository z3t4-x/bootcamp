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
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

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

		List<PagoCredito> lstPagoCreditos  = this.dao.findAll().list();
		// lista PagoCredito que no estan dado de baja
		if(!lstPagoCreditos.isEmpty()) {
			lstPagoCreditos = lstPagoCreditos.stream().filter(c  -> c.getFcBajaFila()==null).toList();
		}
		return lstPagoCreditos;
	}



	/**
	 *
	 */
	@Override
	public PagoCredito buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}
	@Override
	public void eliminar(Long id) throws Exception {
		
		PagoCredito cli = this.dao.findById(id);

		if (Objects.isNull(cli.getIdPagoCredito())) {
			throw new WebApplicationException("Pago Credito no encontrado, error al intentar eliminar el cliente", Response.Status.NOT_FOUND);
		}

		LocalDateTime fcBajaActual =  LocalDateTime.now();

		cli.setFcBajaFila(fcBajaActual);
		this.dao.persist(cli);
		
	}

}
