package com.nttdata.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CATALOGOS")
public class Catalogos {


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


	@Override
	public String toString() {
		return "Catalogos [idCatalogo=" + this.idCatalogo + ", dsNombre=" + this.dsNombre + ", tlDescripcion=" + this.tlDescripcion
				+ ", itMantenible=" + this.itMantenible + "]";
	}





}
