package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Operaciones;



public interface IOperacionesService {

	/**
	 * método para registrar una nueva transaccion
	 * @param transaccion
	 *
	 * @throws Exception
	 */
	public void registrar(Operaciones transaccion) throws Exception;

	/**
	 * método para modificar
	 * @param transaccion
	 *
	 * @throws Exception
	 */
	public void  modificar(Operaciones transaccion) throws Exception;
	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	List<Operaciones> listarTransaccion() throws Exception;

	/**
	 * método para buscar por id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Operaciones buscarPorId(Long id) throws Exception;

	/**
	 * método para eliminar de forma lógica
	 * @param id
	 * @throws Exception
	 */
	void eliminar(Integer id) throws Exception;

}
