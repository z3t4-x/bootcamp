package com.nttdata.domain;

import java.util.List;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "catalogo")
public class Catalogos extends PanacheMongoEntity {


	/**id de Catalogos*/
	private String idCatalogo;

	/**
	 * nombre de catalogo
	 */
	private String dsNombre;

	/**
	 * descripcion del catálogo
	 */
	private String tlDescripcion;

	/**
	 * atributo que describe si el catalogo es mantenible  o no
	 */
	private String itMantenible;

	private List<CatalogosValores> lstCatalogosValores;

	/**
	 * @return the idCatalogo
	 */
	public String getIdCatalogo() {
		return this.idCatalogo;
	}


	/**
	 * @param idCatalogo the idCatalogo to set
	 */
	public void setIdCatalogo(String idCatalogo) {
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


	public List<CatalogosValores> getLstCatalogosValores() {
		return lstCatalogosValores;
	}


	public void setLstCatalogosValores(List<CatalogosValores> lstCatalogosValores) {
		this.lstCatalogosValores = lstCatalogosValores;
	}





}
