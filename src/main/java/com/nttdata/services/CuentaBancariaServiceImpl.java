package com.nttdata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.hibernate.service.spi.ServiceException;

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
public class CuentaBancariaServiceImpl implements CuentaBancariaService{


	@Inject
	private CuentaBancariaDAO dao;

	@Inject
	private TarjetaDAO tarjetaDAO;
	/**
	 *
	 */
	@Override
	@Transactional
	public void registrar(CuentaBancaria cuentaBancaria) throws Exception {

		LocalDateTime fcActual = LocalDateTime.now();

		cuentaBancaria.setFcAltaFila(fcActual);
		cuentaBancaria.setCuentaPrincipal(Constantes.Afimarcion.AFIRMACION_S);

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
		List<CuentaBancaria> lstCuentaBancarias  = this.dao.findAll().list();
		// lista CuentaBancaria que no estan dado de baja
		if(!lstCuentaBancarias.isEmpty()) {
			lstCuentaBancarias = lstCuentaBancarias.stream().filter(c  -> c.getFcBajaFila()==null).toList();
		}
		return lstCuentaBancarias;
	}


	/**
	 *
	 */
	@Override
	public void eliminar(Long id) throws Exception {
/* 
		CuentaBancaria cuentaBancaria = new CuentaBancaria();

		if(Objects.nonNull(id)) {
			LocalDateTime fcBaja =  LocalDateTime.now();
			cuentaBancaria.setFcBajaFila(fcBaja);}

		this.dao.persist(cuentaBancaria);*/

		CuentaBancaria cli = this.dao.findById(id);

		if (Objects.isNull(cli.getIdCuenta())) {
			throw new WebApplicationException("CuentaBancaria no encontrado, error al intentar eliminar el cliente", Response.Status.NOT_FOUND);
		}

		LocalDateTime fcBajaActual =  LocalDateTime.now();

		cli.setFcBajaFila(fcBajaActual);
		this.dao.persist(cli);

	}
	/**
	 *
	 */
	@Override
	public CuentaBancaria buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}


	/**
	 * método para  retiro
	 */

	private Boolean retiraMonto( CuentaBancaria cuentaBancaria) {

		// PENDIENTE
		Tarjeta tarjeta = this.tarjetaDAO.findById(1L);



		Boolean puedeRetirar = Boolean.FALSE;

		if(Objects.isNull(tarjeta.getIdTarjeta())) {
			throw new ServiceException("Error, no se ha podido encontrar la tarjeta");
		}

		// valida si el tipo de operación es de RETIRO
		if(Constantes.CodigoTipoOperacion.RETIRO.equals(cuentaBancaria.getOperaciones().getDsValor())) {

			// si no es cuenta principal lanza error
			if(Constantes.Afimarcion.AFIRMACION_N.equals(cuentaBancaria.getCuentaPrincipal()) ||
					tarjeta.getTipoTarjeta().getCdCodigo().equals(Constantes.TipoTarjeta.TARJETA_CREDITO)) {

				throw new ServiceException("Error, no se puede realizar ningún tipo de operaciones con la cuenta secundaria");
			}

			// valida que sea cuenta principal
			if(Constantes.Afimarcion.AFIRMACION_S.equals(cuentaBancaria.getCuentaPrincipal()) &&
					tarjeta.getTipoTarjeta().getCdCodigo().equals(Constantes.TipoTarjeta.TARJETA_DEBITO)) {


				if(tarjeta.getSaldoActual() > tarjeta.getSaldoDisponible()) {
					throw new ServiceException("Error, no puede retirar, su saldo disponible es : " + tarjeta.getSaldoDisponible());
				}

				Double saldoActual  = tarjeta.getSaldoActual() - tarjeta.getSaldoDisponible();

				tarjeta.setSaldoActual(saldoActual);
				tarjeta.setSaldoDisponible(saldoActual);
				this.tarjetaDAO.persist(tarjeta);

				puedeRetirar = Boolean.TRUE;


			}

		}
		return puedeRetirar;

	}

}
