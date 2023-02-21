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
	private String nmCuenta;

	/**
	 * tarjeta asociada a la cuenta principal o secundaria { S - N }
	 */
	@Column(name="CUENTA_PRINCIPAL")
	private String cuentaPrincipal;


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

	/**
	 * id cliente
	 */
	@ManyToOne
	@JoinColumn(name ="ID_CLIENTE")
	private Cliente cliente;

	//	@JsonIgnore
	//	@ManyToOne
	//	@OneToMany
	//	@JoinColumn(name = "id_tarjeta", nullable = false,
	//	foreignKey = @ForeignKey(name="fk_tarjeta_cuenta"))
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="ID_TARJETA")
	private Tarjeta tarjeta;


	@Column(name="CD_USU_ALTA", nullable = false)
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
