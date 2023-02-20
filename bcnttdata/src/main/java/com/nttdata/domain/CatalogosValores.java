package com.nttdata.domain;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@MongoEntity(collection = "catalogos_valores")
public class CatalogosValores extends PanacheMongoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idValor;
	private String dsValor;
	private String cdCodigo;
	private String itMantenible;

	
	public  CatalogosValores () {}

	public  CatalogosValores (Long idValor){
		this.idValor = idValor;
	}



	@Override
	public String toString() {
		return "CatalogosValores [idValor=" + this.idValor + ", dsValor=" + this.dsValor + ", cdCodigo=" + this.cdCodigo
				+ ", itMantenible=" + this.itMantenible + ", Catalogos=" + "]";
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

}




