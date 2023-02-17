package com.nttdata.domain;

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




}
