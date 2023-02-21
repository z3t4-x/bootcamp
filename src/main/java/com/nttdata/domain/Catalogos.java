package com.nttdata.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CATALOGOS")
public class Catalogos extends Auditoria{


	/**id de Catalogos*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CATALOGO")
	private Long idCatalogo;

	/**
	 * nombre de catalogo
	 */
	@Column(name="DS_NOMBRE")
	private String dsNombre;

	/**
	 * descripcion del catálogo
	 */
	@Column(name="TL_DESCRIPCION")
	private String tlDescripcion;

	/**
	 * atributo que describe si el catalogo es mantenible  o no
	 */
	@Column(name="IT_MANTENIBLE")
	private String itMantenible;


	@Column(name="CD_USU_ALTA")
	private String cdUsuAlta;

	@Column(name="CD_USU_MODIF")
	private String cdUsuModif;

	@Column(name="CD_USU_BAJA")
	private String cdUsuBaja;

	@Column(name="FC_ALTA_FILA")
	private LocalDateTime fcAltaFila;

	@Column(name="FC_MODIF_FILA")
	private LocalDateTime fcModifFila;

	@Column(name="FC_BAJA_FILA")
	private LocalDateTime fcBajaFila;

	/**
	 * @return the idCatalogo
	 */
	public Long getIdCatalogo() {
		return this.idCatalogo;
	}

	/**
	 * @param idCatalogo the idCatalogo to set
	 */
	public void setIdCatalogo(Long idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	/**
	 * @return the dsNombre
	 */
	public String getDsNombre() {
		return this.dsNombre;
	}

	/**
	 * @param dsNombre the dsNombre to set
	 */
	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}

	/**
	 * @return the tlDescripcion
	 */
	public String getTlDescripcion() {
		return this.tlDescripcion;
	}

	/**
	 * @param tlDescripcion the tlDescripcion to set
	 */
	public void setTlDescripcion(String tlDescripcion) {
		this.tlDescripcion = tlDescripcion;
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

	@Override
	public String toString() {
		return "Catalogos [idCatalogo=" + this.idCatalogo + ", dsNombre=" + this.dsNombre + ", tlDescripcion=" + this.tlDescripcion
				+ ", itMantenible=" + this.itMantenible + ", cdUsuAlta=" + this.cdUsuAlta + ", cdUsuModif=" + this.cdUsuModif
				+ ", cdUsuBaja=" + this.cdUsuBaja + ", fcAltaFila=" + this.fcAltaFila + ", fcModifFila=" + this.fcModifFila
				+ ", fcBajaFila=" + this.fcBajaFila + "]";
	}





}
