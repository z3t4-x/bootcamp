package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Cliente;

public interface ClienteService {
	/**
	 * método para registrar cliente
	 * @param cliente
	 * @throws Exception
	 */
	public void registrar(Cliente cliente) throws Exception;
	/**
	 * modificar
	 * @param id
	 * @param cliente
	 * @throws Exception
	 */

	public void  modificar(Long id, Cliente cliente) throws Exception;
	/**
	 * método para listar clientes
	 * @return
	 * @throws Exception
	 */
	List<Cliente> listarCliente() throws Exception;

	/**
	 * método para buscar por id del cliente
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Cliente buscarPorId(Long id) throws Exception;





}
