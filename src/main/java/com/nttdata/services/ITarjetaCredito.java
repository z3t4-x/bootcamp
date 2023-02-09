package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.TarjetaCredito;

public interface ITarjetaCredito {

	/**
	 * método para el tipo de tarjeta de crédito
	 * @param cliente
	 * @throws Exception
	 */
	public void registrar(TarjetaCredito tarjetaCredito) throws Exception;
	/**
	 * método para modificar el tipo de tarjeta de crédito
	 * @param cliente
	 * @throws Exception
	 */

	public void  modificar(TarjetaCredito tarjetaCredito) throws Exception;
	/**
	 * método para listar las tarjetas de crédito
	 * @return
	 * @throws Exception
	 */
	List<TarjetaCredito> listarTarjetaCredito() throws Exception;

	/**
	 * método para buscar por id de la tarjeta de crédito
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TarjetaCredito buscarPorId(Integer id) throws Exception;
}
