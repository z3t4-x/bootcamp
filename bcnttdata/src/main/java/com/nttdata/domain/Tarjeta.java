package com.nttdata.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


public class Tarjeta extends PanacheMongoEntity{

	/**
	 * id tarjeta
	 */
	@Id
	private  Long idTarjeta;
	/**
	 * numero de tarjeta
	 */
	private String nmTarjeta;
	/**
	 * código pin
	 */
	private Integer cdPin;
	/**
	 * fecha vencimiento
	 */
	private LocalDate fcVencimiento;
	/**
	 * codigo validación
	 */
	private Integer cdValidacion;
	/**
	 * fecha de corte de tarjeta
	 */
	private LocalDate fcCorte;
	/**
	 * fecha de vencimiento mensual
	 */
	private LocalDate fcVencimientoMensual;
	/**
	 * saldo actual desps del retiro
	 */
	private Double saldoActual;
	/**
	 * fecha limite de crédito
	 */
	private Double limiteCredito;
	/**
	 * tipo de tarjeta {débito o crédito}
	 */

	private List<CuentaBancaria> lstCuentaBancaria;

	private Double saldoInicial;


	/**
	 * saldo de la tarjeta
	 */
	@Column(name="SALDO_DISPONIBLE")
	private Double saldoDisponible;


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



	@Column(name="TARJETA_ACTIVA")
	private String tarjetaActiva;


	/**
	 * @return the saldoDisponible
	 */
	public Double getSaldoDisponible() {
		return this.saldoDisponible;
	}

	/**
	 * @param saldoDisponible the saldoDisponible to set
	 */
	public void setSaldoDisponible(Double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	/**
	 * @return the idTarjeta
	 */
	public Long getIdTarjeta() {
		return this.idTarjeta;
	}

	/**
	 * @param idTarjeta the idTarjeta to set
	 */
	public void setIdTarjeta(Long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}



	/**
	 * @return the nmTarjeta
	 */
	public String getNmTarjeta() {
		return this.nmTarjeta;
	}

	/**
	 * @param nmTarjeta the nmTarjeta to set
	 */
	public void setNmTarjeta(String nmTarjeta) {
		this.nmTarjeta = nmTarjeta;
	}

	/**
	 * @return the cdPin
	 */
	public Integer getCdPin() {
		return this.cdPin;
	}

	/**
	 * @param cdPin the cdPin to set
	 */
	public void setCdPin(Integer cdPin) {
		this.cdPin = cdPin;
	}

	/**
	 * @return the fcVencimiento
	 */
	public LocalDate getFcVencimiento() {
		return this.fcVencimiento;
	}

	/**
	 * @param fcVencimiento the fcVencimiento to set
	 */
	public void setFcVencimiento(LocalDate fcVencimiento) {
		this.fcVencimiento = fcVencimiento;
	}

	/**
	 * @return the cdValidacion
	 */
	public Integer getCdValidacion() {
		return this.cdValidacion;
	}

	/**
	 * @param cdValidacion the cdValidacion to set
	 */
	public void setCdValidacion(Integer cdValidacion) {
		this.cdValidacion = cdValidacion;
	}

	/**
	 * @return the fcCorte
	 */
	public LocalDate getFcCorte() {
		return this.fcCorte;
	}

	/**
	 * @param fcCorte the fcCorte to set
	 */
	public void setFcCorte(LocalDate fcCorte) {
		this.fcCorte = fcCorte;
	}

	/**
	 * @return the fcVencimientoMensual
	 */
	public LocalDate getFcVencimientoMensual() {
		return this.fcVencimientoMensual;
	}

	/**
	 * @param fcVencimientoMensual the fcVencimientoMensual to set
	 */
	public void setFcVencimientoMensual(LocalDate fcVencimientoMensual) {
		this.fcVencimientoMensual = fcVencimientoMensual;
	}

	/**
	 * @return the saldoActual
	 */
	public Double getSaldoActual() {
		return this.saldoActual;
	}

	/**
	 * @param saldoActual the saldoActual to set
	 */
	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}

	/**
	 * @return the limiteCredito
	 */
	public Double getLimiteCredito() {
		return this.limiteCredito;
	}

	/**
	 * @param limiteCredito the limiteCredito to set
	 */
	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	
	/**
	 * @return the saldoInicial
	 */
	public Double getSaldoInicial() {
		return this.saldoInicial;
	}

	/**
	 * @param saldoInicial the saldoInicial to set
	 */
	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
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

	/**
	 * @return the tarjetaActiva
	 */
	public String getTarjetaActiva() {
		return this.tarjetaActiva;
	}

	/**
	 * @param tarjetaActiva the tarjetaActiva to set
	 */
	public void setTarjetaActiva(String tarjetaActiva) {
		this.tarjetaActiva = tarjetaActiva;
	}







}
