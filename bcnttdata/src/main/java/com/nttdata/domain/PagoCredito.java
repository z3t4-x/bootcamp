package com.nttdata.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class PagoCredito extends PanacheMongoEntity{


	/**
	 * id de tipo de cliente
	 */
	@Id
	@GeneratedMongoValue(strategy = GenerationType.IDENTITY)
	private Long idPagoCredito;

	/**
	 * fecha de inicio de crédito
	 */
	private LocalDateTime fcInicio;

	/**
	 * número de cuotas de crédito
	 */
	private Integer nmCuotas;

	/**
	 * fecha de pago mensual del crédito
	 */
	private LocalDate fcPagoMensual;

	/**
	 * saldo inicial del crédito
	 */
	private Double saldoInicial;

	/**
	 * saldo actual del crédito
	 */
	private Double saldoActual;

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
	 * @return the idPagoCredito
	 */
	public Long getIdPagoCredito() {
		return this.idPagoCredito;
	}

	private List<CuentaBancaria> lstCuentaBancaria;

	/**
	 * @param idPagoCredito the idPagoCredito to set
	 */
	public void setIdPagoCredito(Long idPagoCredito) {
		this.idPagoCredito = idPagoCredito;
	}

	/**
	 * @return the fcInicio
	 */
	public LocalDateTime getFcInicio() {
		return this.fcInicio;
	}

	/**
	 * @param fcInicio the fcInicio to set
	 */
	public void setFcInicio(LocalDateTime fcInicio) {
		this.fcInicio = fcInicio;
	}

	/**
	 * @return the nmCuotas
	 */
	public Integer getNmCuotas() {
		return this.nmCuotas;
	}

	/**
	 * @param nmCuotas the nmCuotas to set
	 */
	public void setNmCuotas(Integer nmCuotas) {
		this.nmCuotas = nmCuotas;
	}

	/**
	 * @return the fcPagoMensual
	 */
	public LocalDate getFcPagoMensual() {
		return this.fcPagoMensual;
	}

	/**
	 * @param fcPagoMensual the fcPagoMensual to set
	 */
	public void setFcPagoMensual(LocalDate fcPagoMensual) {
		this.fcPagoMensual = fcPagoMensual;
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
	
	public LocalDateTime getFcAltaFila() {
		return fcAltaFila;
	}

	public void setFcAltaFila(LocalDateTime fcAltaFila) {
		this.fcAltaFila = fcAltaFila;
	}

	public LocalDateTime getFcModifFila() {
		return fcModifFila;
	}

	public void setFcModifFila(LocalDateTime fcModifFila) {
		this.fcModifFila = fcModifFila;
	}

	public LocalDateTime getFcBajaFila() {
		return fcBajaFila;
	}

	public void setFcBajaFila(LocalDateTime fcBajaFila) {
		this.fcBajaFila = fcBajaFila;
	}

	@Override
	public String toString() {
		return "PagoCredito [idPagoCredito=" + this.idPagoCredito + ", fcInicio=" + this.fcInicio + ", nmCuotas=" + this.nmCuotas
				+ ", fcPagoMensual=" + this.fcPagoMensual + ", saldoInicial=" + this.saldoInicial + ", saldoActual=" + this.saldoActual
				+ "]";
	}




}
