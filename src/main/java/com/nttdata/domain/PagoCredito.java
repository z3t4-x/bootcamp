package com.nttdata.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PAGO_CREDITO")
public class PagoCredito {


	/**
	 * id de tipo de cliente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PAGO_CREDITO")
	private Long idPagoCredito;

	/**
	 * fecha de inicio de crédito
	 */
	@Column(name="FC_INICIO")
	private LocalDateTime fcInicio;

	/**
	 * número de cuotas de crédito
	 */
	@Column(name="NM_CUOTAS")
	private Integer nmCuotas;

	/**
	 * fecha de pago mensual del crédito
	 */
	@Column(name="FC_PAGO_MENSUAL")
	private LocalDate fcPagoMensual;

	/**
	 * saldo inicial del crédito
	 */
	@Column(name="SALDO_INICIAL")
	private Double saldoInicial;

	/**
	 * saldo actual del crédito
	 */
	@Column(name="SALDO_ACTUAL")
	private Double saldoActual;

	@Column(name="CD_USU_ALTA",  nullable = false)
	private String cdUsuAlta;

	@Column(name="CD_USU_MODIF")
	private String cdUsuModif;

	@Column(name="CD_USU_BAJA")
	private String cdUsuBaja;

	@Column(name="FC_ALTA_FILA", nullable = false)
	private LocalDateTime fcAltaFila;

	@Column(name="FC_MODIF_FILA")
	private LocalDateTime fcModifFila;

	@Column(name="FC_BAJA_FILA")
	private LocalDateTime fcBajaFila;

	/**
	 * @return the idPagoCredito
	 */
	public Long getIdPagoCredito() {
		return this.idPagoCredito;
	}

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
		return this.fcAltaFila;
	}

	public void setFcAltaFila(LocalDateTime fcAltaFila) {
		this.fcAltaFila = fcAltaFila;
	}

	public LocalDateTime getFcModifFila() {
		return this.fcModifFila;
	}

	public void setFcModifFila(LocalDateTime fcModifFila) {
		this.fcModifFila = fcModifFila;
	}

	public LocalDateTime getFcBajaFila() {
		return this.fcBajaFila;
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

	/**
	 * @return the cdUsuAlta
	 */
	public String getCdUsuAlta() {
		return this.cdUsuAlta;
	}

	/**
	 * @param cdUsuAlta the cdUsuAlta to set
	 */
	public void setCdUsuAlta(String cdUsuAlta) {
		this.cdUsuAlta = cdUsuAlta;
	}

	/**
	 * @return the cdUsuModif
	 */
	public String getCdUsuModif() {
		return this.cdUsuModif;
	}

	/**
	 * @param cdUsuModif the cdUsuModif to set
	 */
	public void setCdUsuModif(String cdUsuModif) {
		this.cdUsuModif = cdUsuModif;
	}

	/**
	 * @return the cdUsuBaja
	 */
	public String getCdUsuBaja() {
		return this.cdUsuBaja;
	}

	/**
	 * @param cdUsuBaja the cdUsuBaja to set
	 */
	public void setCdUsuBaja(String cdUsuBaja) {
		this.cdUsuBaja = cdUsuBaja;
	}




}
