package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.CatalogosValores;

public interface CatalogosValoresService {
	/**
	 * método para registrar
	 * @param cliente
	 * @throws Exception
	 */
	public void registrar(CatalogosValores catalogosValores) throws Exception;
	/**
	 * modificar
	 * @param id
	 * @param cliente
	 * @throws Exception
	 */

	//public CatalogosValores  modificar(Long id, CatalogosValores catalogosValores) throws Exception;
	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	List<CatalogosValores> listar() throws Exception;

	/**
	 * método para buscar por id del cliente
	 * @param id
	 * @return
	 * @throws Exception
	 */
	//CatalogosValores buscarPorId(Long id) throws Exception;


	//public void  modificar2(CatalogosValores catalogosValores) throws Exception;



}
