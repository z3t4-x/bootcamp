package com.nttdata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.hibernate.service.spi.ServiceException;

import com.nttdata.dao.CuentaBancariaDAO;
import com.nttdata.domain.CuentaBancaria;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CuentaBancariaServiceImpl implements CuentaBancariaService{


	@Inject
	private CuentaBancariaDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public void registrar(CuentaBancaria cuentaBancaria) throws Exception {


		LocalDateTime fcActual = LocalDateTime.now();

		cuentaBancaria.setFcAltaFila(fcActual);
		this.dao.persist(cuentaBancaria);


	}
	/**
	 *
	 */
	@Override
	public void modificar(Long id, CuentaBancaria cuentaBancaria) throws Exception {

		CuentaBancaria ctBancaria = this.dao.findById(id);

		if (Objects.isNull(ctBancaria.getIdCuenta())) {
			throw new ServiceException("Error al editar, no se encontró el id: " + cuentaBancaria.getIdCuenta());
		}

		LocalDateTime fcActual = LocalDateTime.now();

		ctBancaria.setTjAsocPrincipal("S");
		ctBancaria.setTjAsocSecundaria("N");
		ctBancaria.setPagoCredito(cuentaBancaria.getPagoCredito());
		ctBancaria.setOperaciones(cuentaBancaria.getOperaciones());
		ctBancaria.setNmCuenta(cuentaBancaria.getNmCuenta());

		ctBancaria.setFcModifFila(fcActual);
		this.dao.persist(ctBancaria);


	}
	/**
	 *
	 */
	@Override
	public List<CuentaBancaria> listarCuentaBancaria() throws Exception {

		return this.dao.findAll().list();
	}


	/**
	 *
	 */
	@Override
	public void eliminar(Long id) throws Exception {

		CuentaBancaria cuentaBancaria = new CuentaBancaria();

		if(Objects.nonNull(id)) {
			LocalDateTime fcBaja =  LocalDateTime.now();
			cuentaBancaria.setFcBajaFila(fcBaja);}

		this.dao.persist(cuentaBancaria);



	}
	/**
	 *
	 */
	@Override
	public CuentaBancaria buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}

}
