package com.nttdata.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="CUENTA_CLIENTE")
@IdClass(CuentaClientePK.class)
public class CuentaCliente {

	/**
	 * id cuenta tipo cliente
	 */

	@Id
	private Cliente cliente;
	/**
	 * id cuenta bancaria
	 */

	@Id
	private CuentaBancaria cuentaBancaria;



	/**
	 * fecha de operacion
	 */
	@Column(name="FC_OPERACION")
	private LocalDateTime fcOperacion;

	/**
	 * fecha de alta
	 */
	@Column(name="FC_ALTA_FILA")
	private LocalDateTime fcAltaFila;

	/**
	 * fecha de modificacion
	 */
	@Column(name="FC_MODIF_FILA")
	private LocalDateTime fcModifFila;

	/**
	 * fecha de baja
	 */
	@Column(name="FC_BAJA_FILA")
	private LocalDateTime fcBajaFila;

	/**
	 * @return the cuentaBancaria
	 */
	public CuentaBancaria getCuentaBancaria() {
		return this.cuentaBancaria;
	}

	/**
	 * @param cuentaBancaria the cuentaBancaria to set
	 */
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return this.cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the fcOperacion
	 */
	public LocalDateTime getFcOperacion() {
		return this.fcOperacion;
	}

	/**
	 * @param fcOperacion the fcOperacion to set
	 */
	public void setFcOperacion(LocalDateTime fcOperacion) {
		this.fcOperacion = fcOperacion;
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




}
