package com.nttdata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.nttdata.dao.CuentaBancariaDAO;
import com.nttdata.dao.TarjetaDAO;
import com.nttdata.domain.CuentaBancaria;
import com.nttdata.domain.Tarjeta;
import com.nttdata.utils.Constantes;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class TarjetaServiceImpl implements TarjetaService{

	/**
	 * dao tarjeta
	 */

	@Inject
	private TarjetaDAO dao;

	/**
	 * dao cuenta bancaria
	 */
	@Inject
	private CuentaBancariaDAO cuentaBancariaDAO;
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

		List<Tarjeta> lstTarjetas  = this.dao.findAll().list();
		// lista tarjeta que no estan dado de baja
		if(!lstTarjetas.isEmpty()) {
			lstTarjetas = lstTarjetas.stream().filter(c  -> c.getFcBajaFila()==null).toList();
		}
		return lstTarjetas;
	}

	/**
	 *
	 */
	@Override
	public Tarjeta buscarPorId(Long id) throws Exception {

		return this.dao.findByIdOptional(id).orElse(null);
	}

	/**
	 *
	 */
	@Override
	public void eliminar(Long id, Tarjeta tarjeta) throws Exception {

		Tarjeta tarjet = this.dao.findById(id);

		if (Objects.isNull(tarjet.getIdTarjeta())) {
			throw new WebApplicationException("Tarjeta no encontrada, error al intentar eliminar. ", Response.Status.NOT_FOUND);
		}

		LocalDateTime fcBajaActual =  LocalDateTime.now();

		List<CuentaBancaria> lstCtaBancaria = this.cuentaBancariaDAO.findAll().list();

		if(!lstCtaBancaria.isEmpty()) {

			lstCtaBancaria= lstCtaBancaria.stream().filter(cuenta -> cuenta.getTarjeta().getIdTarjeta().equals(tarjet.getIdTarjeta())).toList();


			for (CuentaBancaria cuentaBancaria : lstCtaBancaria) {

				cuentaBancaria.setFcBajaFila(fcBajaActual);
				this.cuentaBancariaDAO.persist(cuentaBancaria);

			}

		}
		tarjet.setTarjetaActiva(Constantes.Afimarcion.AFIRMACION_N);
		tarjet.setFcBajaFila(fcBajaActual);
		this.dao.persist(tarjet);


	}




}
