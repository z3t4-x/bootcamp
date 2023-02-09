package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.TipoCliente;

public interface ITipoClienteService {
	/**
	 * método para registrar el tipo de cliente, si es persona con ruc o persona natural
	 * @param tipoCliente
	 * @throws Exception
	 */
	public void registrar(TipoCliente tipoCliente) throws Exception;
	/**
	 *método para modificar el tipo de cliente
	 * @param tipoCliente
	 * @throws Exception
	 */

	public void modificar(TipoCliente tipoCliente) throws Exception;
	/**
	 * método para listar los tipo de clientes
	 * @return
	 * @throws Exception
	 */
	List<TipoCliente> listarTiposCliente() throws Exception;

	/**
	 * método para buscar por id del tipo de cliente
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TipoCliente buscarPorId(Integer id) throws Exception;

	/**
	 * método para eliminar de forma lógica
	 * @param id
	 * @throws Exception
	 */
	void eliminar(Integer id) throws Exception;
}
