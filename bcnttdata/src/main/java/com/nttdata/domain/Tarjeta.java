package com.nttdata.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import jakarta.persistence.Id;

@MongoEntity
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
	
	private Double saldoDisponible;


	private LocalDateTime fcAltaFila;
	/**
	 * fecha de modificacion
	 */
	private LocalDateTime fcModifFila;
	/**
	 * fecha de baja
	 */
	private LocalDateTime fcBajaFila;


	private String tarjetaActiva;


	public Long getIdTarjeta() {
		return idTarjeta;
	}


	public void setIdTarjeta(Long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}


	public String getNmTarjeta() {
		return nmTarjeta;
	}


	public void setNmTarjeta(String nmTarjeta) {
		this.nmTarjeta = nmTarjeta;
	}


	public Integer getCdPin() {
		return cdPin;
	}


	public void setCdPin(Integer cdPin) {
		this.cdPin = cdPin;
	}


	public LocalDate getFcVencimiento() {
		return fcVencimiento;
	}


	public void setFcVencimiento(LocalDate fcVencimiento) {
		this.fcVencimiento = fcVencimiento;
	}


	public Integer getCdValidacion() {
		return cdValidacion;
	}


	public void setCdValidacion(Integer cdValidacion) {
		this.cdValidacion = cdValidacion;
	}


	public LocalDate getFcCorte() {
		return fcCorte;
	}


	public void setFcCorte(LocalDate fcCorte) {
		this.fcCorte = fcCorte;
	}


	public LocalDate getFcVencimientoMensual() {
		return fcVencimientoMensual;
	}


	public void setFcVencimientoMensual(LocalDate fcVencimientoMensual) {
		this.fcVencimientoMensual = fcVencimientoMensual;
	}


	public Double getSaldoActual() {
		return saldoActual;
	}


	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}


	public Double getLimiteCredito() {
		return limiteCredito;
	}


	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}


	public List<CuentaBancaria> getLstCuentaBancaria() {
		return lstCuentaBancaria;
	}


	public void setLstCuentaBancaria(List<CuentaBancaria> lstCuentaBancaria) {
		this.lstCuentaBancaria = lstCuentaBancaria;
	}


	public Double getSaldoInicial() {
		return saldoInicial;
	}


	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}


	public Double getSaldoDisponible() {
		return saldoDisponible;
	}


	public void setSaldoDisponible(Double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
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


	public String getTarjetaActiva() {
		return tarjetaActiva;
	}


	public void setTarjetaActiva(String tarjetaActiva) {
		this.tarjetaActiva = tarjetaActiva;
	}


}
