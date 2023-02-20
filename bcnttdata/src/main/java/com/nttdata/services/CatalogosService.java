package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Catalogos;

public interface CatalogosService {
	/**
	 * método para registrar
	 * @param cliente
	 * @throws Exception
	 */
	public void registrar(Catalogos catalogos) throws Exception;
	/**
	 * modificar
	 * @param id
	 * @param catalogos
	 * @throws Exception
	 */

//	public Catalogos  modificar(Long id, Catalogos catalogos) throws Exception;
	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	List<Catalogos> listar() throws Exception;

	/**
	 * método para buscar por id
	 * @param id
	 * @return
	 * @throws Exception
	 */
//	Catalogos buscarPorId(Long id) throws Exception;


//	public void  modificar2(Catalogos catalogos) throws Exception;



}
