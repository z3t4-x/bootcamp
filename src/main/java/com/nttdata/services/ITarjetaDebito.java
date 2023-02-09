package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.TarjetaDebito;

public interface ITarjetaDebito {

	/**
	 * método para el tipo de tarjeta de débito
	 * @param cliente
	 * @throws Exception
	 */
	public void registrar(TarjetaDebito tarjetaDebito ) throws Exception;
	/**
	 * método para modificar el tipo de tarjeta de débito
	 * @param cliente
	 * @throws Exception
	 */

	public void  modificar(TarjetaDebito tarjetaDebito) throws Exception;
	/**
	 * método para listar las tarjetas de débito
	 * @return
	 * @throws Exception
	 */
	List<TarjetaDebito> listarTarjetaDebito() throws Exception;

	/**
	 * método para buscar por id de la tarjeta de crédito
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TarjetaDebito buscarPorId(Integer id) throws Exception;
}
