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
@Table(name="CATALOGOS_VALORES")
public class CatalogosValores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_VALOR")
	private Long idValor;


	@Column(name="DS_VALOR")
	private String dsValor;

	@Column(name="CD_CODIGO")
	private String cdCodigo;

	@Column(name="IT_MANTENIBLE")
	private String itMantenible;

	@ManyToOne
	@JoinColumn(name ="ID_CATALOGO")
	private Catalogos Catalogos;

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




	public  CatalogosValores () {}

	public  CatalogosValores (Long idValor){
		this.idValor = idValor;
	}



	@Override
	public String toString() {
		return "CatalogosValores [idValor=" + this.idValor + ", dsValor=" + this.dsValor + ", cdCodigo=" + this.cdCodigo
				+ ", itMantenible=" + this.itMantenible + ", Catalogos=" + this.Catalogos + "]";
	}

	/**
	 * @return the idValor
	 */
	public Long getIdValor() {
		return this.idValor;
	}

	/**
	 * @param idValor the idValor to set
	 */
	public void setIdValor(Long idValor) {
		this.idValor = idValor;
	}

	/**
	 * @return the dsValor
	 */
	public String getDsValor() {
		return this.dsValor;
	}

	/**
	 * @param dsValor the dsValor to set
	 */
	public void setDsValor(String dsValor) {
		this.dsValor = dsValor;
	}

	/**
	 * @return the cdCodigo
	 */
	public String getCdCodigo() {
		return this.cdCodigo;
	}

	/**
	 * @param cdCodigo the cdCodigo to set
	 */
	public void setCdCodigo(String cdCodigo) {
		this.cdCodigo = cdCodigo;
	}

	/**
	 * @return the itMantenible
	 */
	public String getItMantenible() {
		return this.itMantenible;
	}

	/**
	 * @param itMantenible the itMantenible to set
	 */
	public void setItMantenible(String itMantenible) {
		this.itMantenible = itMantenible;
	}

	/**
	 * @return the catalogos
	 */
	public Catalogos getCatalogos() {
		return this.Catalogos;
	}

	/**
	 * @param catalogos the catalogos to set
	 */
	public void setCatalogos(Catalogos catalogos) {
		this.Catalogos = catalogos;
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
