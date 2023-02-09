package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.TipoTarjeta;

public interface ITipoTarjeta {

	/**
	 * método para el tipo de tarjeta
	 * @param cliente
	 * @throws Exception
	 */
	public void registrar(TipoTarjeta tipoTarjeta) throws Exception;
	/**
	 * método para modificar el tipo de tarjeta
	 * @param cliente
	 * @throws Exception
	 */

	public void  modificar(TipoTarjeta tipoTarjeta) throws Exception;
	/**
	 * método para listar los tipos de tarjeta
	 * @return
	 * @throws Exception
	 */
	List<TipoTarjeta> listarTiposTarjeta() throws Exception;

	/**
	 * método para buscar por id de la tarjeta
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TipoTarjeta buscarPorId(Integer id) throws Exception;

}
