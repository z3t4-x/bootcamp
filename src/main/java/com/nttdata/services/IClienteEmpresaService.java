package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.ClienteEmpresa;

public interface IClienteEmpresaService {
	/**
	 * método para registrar cliente empresa
	 * @param empresa
	 * @throws Exception
	 */
	public void  registrar(ClienteEmpresa empresa) throws Exception;
	/**
	 * método para modificar
	 * @param empresa
	 * @throws Exception
	 */

	public void modificar(ClienteEmpresa empresa) throws Exception;
	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	List<ClienteEmpresa> listarEmpresa() throws Exception;

	/**
	 * método para buscar por id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ClienteEmpresa buscarPorId(Integer id) throws Exception;


	//	void eliminar(Integer id) throws Exception;
}
