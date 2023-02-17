package com.nttdata.domain;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

public class CuentaBancaria extends PanacheMongoEntity {

	/**id de cuenta*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idCuenta;
	/**
	 * id de operaciones
	 */	
	private String nmCuenta;

	/**
	 * tarjeta asociada a la cuenta principal o secundaria { S - N }
	 */
	private String cuentaPrincipal;

	
	private LocalDateTime fcAltaFila;
	/**
	 * fecha de modificacion
	 */
	private LocalDateTime fcModifFila;
	/**
	 * fecha de baja
	 */
	private LocalDateTime fcBajaFila;


	/**
	 * @return the idCuenta
	 */
	public Long getIdCuenta() {
		return this.idCuenta;
	}

	/**
	 * @param idCuenta the idCuenta to set
	 */
	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}




	/**
	 * @return the nmCuenta
	 */
	public String getNmCuenta() {
		return this.nmCuenta;
	}

	/**
	 * @param nmCuenta the nmCuenta to set
	 */
	public void setNmCuenta(String nmCuenta) {
		this.nmCuenta = nmCuenta;
	}

	/**
	 * @return the pagoCredito
	 */
	public PagoCredito getPagoCredito() {
		return this.pagoCredito;
	}

	/**
	 * @param pagoCredito the pagoCredito to set
	 */
	public void setPagoCredito(PagoCredito pagoCredito) {
		this.pagoCredito = pagoCredito;
	}

	/**
	 * @return the fcAltaFila
	 */
	public LocalDateTime getFcAltaFila() {
		return this.fcAltaFila;
	}

	/**
	 * @param fcAltaFila the fcAltaFila to set
	 */
	public void setFcAltaFila(LocalDateTime fcAltaFila) {
		this.fcAltaFila = fcAltaFila;
	}

	/**
	 * @return the fcModifFila
	 */
	public LocalDateTime getFcModifFila() {
		return this.fcModifFila;
	}

	/**
	 * @param fcModifFila the fcModifFila to set
	 */
	public void setFcModifFila(LocalDateTime fcModifFila) {
		this.fcModifFila = fcModifFila;
	}

	/**
	 * @return the fcBajaFila
	 */
	public LocalDateTime getFcBajaFila() {
		return this.fcBajaFila;
	}

	/**
	 * @param fcBajaFila the fcBajaFila to set
	 */
	public void setFcBajaFila(LocalDateTime fcBajaFila) {
		this.fcBajaFila = fcBajaFila;
	}

	// /**
	//  * @return the cliente
	//  */
	// public Cliente getCliente() {
	// 	return this.cliente;
	// }

	// /**
	//  * @param cliente the cliente to set
	//  */
	// public void setCliente(Cliente cliente) {
	// 	this.cliente = cliente;
	// }

	/**
	 * @return the cuentaPrincipal
	 */
	public String getCuentaPrincipal() {
		return this.cuentaPrincipal;
	}

	/**
	 * @param cuentaPrincipal the cuentaPrincipal to set
	 */
	public void setCuentaPrincipal(String cuentaPrincipal) {
		this.cuentaPrincipal = cuentaPrincipal;
	}

	/**
	 * @return the tarjeta
	 */
	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	/**
	 * @param tarjeta the tarjeta to set
	 */
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}







}
