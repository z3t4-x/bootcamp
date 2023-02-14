package com.nttdata.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CUENTA_BANCARIA")
public class CuentaBancaria {

	/**id de cuenta*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CUENTA")
	private Long idCuenta;
	/**
	 * id de operaciones
	 */
	@Column(name="NM_CUENTA")
	private Integer nmCuenta;

	/**
	 * tarjeta asociada a la cuenta principal
	 */
	@Column(name="TJ_ASOC_PRINCIPAL")
	private String tjAsocPrincipal;

	/**
	 * tarjeta asociada a la cuenta secundaria
	 */
	@Column(name="TJ_ASOC_SECUNDARIA")
	private String tjAsocSecundaria;

	/**
	 *ID que identifica si es el de pago crédito
	 */
	@ManyToOne
	@JoinColumn(name ="ID_PAGO_CREDITO")
	private PagoCredito pagoCredito;

	/**
	 * identifica el tipo de operación, retiro, depósito
	 */
	@ManyToOne
	@JoinColumn(name ="ID_OPERACION")
	private CatalogosValores operaciones;


	@ManyToOne
	@JoinColumn(name ="ID_CLIENTE")
	private Cliente cliente;


	/**
	 * identifica el tipo de operación, retiro, depósito
	 */
	@ManyToOne
	@JoinColumn(name ="ID_TARJETA")
	private Tarjeta tarjeta;


	@Column(name="FC_ALTA_FILA")
	private LocalDateTime fcAltaFila;

	@Column(name="FC_MODIF_FILA")
	private LocalDateTime fcModifFila;

	@Column(name="FC_BAJA_FILA")
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
	public Integer getNmCuenta() {
		return this.nmCuenta;
	}

	/**
	 * @param nmCuenta the nmCuenta to set
	 */
	public void setNmCuenta(Integer nmCuenta) {
		this.nmCuenta = nmCuenta;
	}

	/**
	 * @return the tjAsocPrincipal
	 */
	public String getTjAsocPrincipal() {
		return this.tjAsocPrincipal;
	}

	/**
	 * @param tjAsocPrincipal the tjAsocPrincipal to set
	 */
	public void setTjAsocPrincipal(String tjAsocPrincipal) {
		this.tjAsocPrincipal = tjAsocPrincipal;
	}

	/**
	 * @return the tjAsocSecundaria
	 */
	public String getTjAsocSecundaria() {
		return this.tjAsocSecundaria;
	}

	/**
	 * @param tjAsocSecundaria the tjAsocSecundaria to set
	 */
	public void setTjAsocSecundaria(String tjAsocSecundaria) {
		this.tjAsocSecundaria = tjAsocSecundaria;
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
	 * @return the operaciones
	 */
	public CatalogosValores getOperaciones() {
		return this.operaciones;
	}

	/**
	 * @param operaciones the operaciones to set
	 */
	public void setOperaciones(CatalogosValores operaciones) {
		this.operaciones = operaciones;
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


	@Override
	public String toString() {
		return "CuentaBancaria [idCuenta=" + this.idCuenta + ", nmCuenta=" + this.nmCuenta + ", tjAsocPrincipal="
				+ this.tjAsocPrincipal + ", tjAsocSecundaria=" + this.tjAsocSecundaria + ", pagoCredito=" + this.pagoCredito
				+ ", operaciones=" + this.operaciones + ", tarjeta=" + this.tarjeta + ", fcAltaFila=" + this.fcAltaFila
				+ ", fcModifFila=" + this.fcModifFila + ", fcBajaFila=" + this.fcBajaFila + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.idCuenta == null) ? 0 : this.idCuenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		CuentaBancaria other = (CuentaBancaria) obj;
		if (this.idCuenta == null) {
			if (other.idCuenta != null) {
				return false;
			}
		} else if (!this.idCuenta.equals(other.idCuenta)) {
			return false;
		}
		return true;
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






}
