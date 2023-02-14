package com.nttdata.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TARJETA")
public class Tarjeta {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long idTarjeta;
	/**
	 * numero de tarjeta
	 */
	@Column(name="NM_TARJETA")
	private String nmTarjeta;
	/**
	 * código pin
	 */
	@Column(name="CD_PIN")
	private Integer cdPin;
	/**
	 * fecha vencimiento
	 */
	@Column(name="FC_VENCIMIENTO")
	private LocalDate fcVencimiento;
	/**
	 * codigo validación
	 */
	@Column(name="CD_VALIDACION")
	private Integer cdValidacion;
	/**
	 * fecha de corte de tarjeta
	 */
	@Column(name="FC_CORTE")
	private LocalDate fcCorte;
	/**
	 * fecha de vencimiento mensual
	 */
	@Column(name="FC_VENCIMIENTO_MENSUAL")
	private LocalDate fcVencimientoMensual;
	/**
	 * saldo actual desps del retiro
	 */
	@Column(name="SALDO_ACTUAL")
	private Double saldoActual;
	/**
	 * fecha limite de crédito
	 */
	@Column(name="LIMITE_CREDITO")
	private Double limiteCredito;
	/**
	 * tipo de tarjeta {débito o crédito}
	 */
	@ManyToOne
	@JoinColumn(name ="ID_TIPO_TARJETA", nullable =  false)
	private CatalogosValores tipoTarjeta;

	/**
	 * saldo de la tarjeta crédito
	 */
	@Column(name="SALDO_INICIAL")
	private Double saldoInicial;


	/**
	 * saldo de la tarjeta
	 */
	@Column(name="SALDO_DISPONIBLE")
	private Double saldoDisponible;

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
	 * @return the tipoTarjeta
	 */
	public CatalogosValores getTipoTarjeta() {
		return this.tipoTarjeta;
	}

	/**
	 * @param tipoTarjeta the tipoTarjeta to set
	 */
	public void setTipoTarjeta(CatalogosValores tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}


	@Override
	public String toString() {
		return "Tarjeta [idTarjeta=" + this.idTarjeta + ", nmTarjeta=" + this.nmTarjeta + ", cdPin=" + this.cdPin + ", fcVencimiento="
				+ this.fcVencimiento + ", cdValidacion=" + this.cdValidacion + ", fcCorte=" + this.fcCorte + ", fcVencimientoMensual="
				+ this.fcVencimientoMensual + ", saldoActual=" + this.saldoActual + ", limiteCredito=" + this.limiteCredito
				+ ", tipoTarjeta=" + this.tipoTarjeta + ", saldoInicial=" + this.saldoInicial + "]";
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




}
