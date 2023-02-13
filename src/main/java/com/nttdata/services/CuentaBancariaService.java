package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.CuentaBancaria;



public interface CuentaBancariaService {

	/**
	 * método para registrar una nueva cuenta bancaria
	 * @param transaccion
	 *
	 * @throws Exception
	 */
	public void registrar(CuentaBancaria cuentaBancaria) throws Exception;

	/**
	 * método para modificar
	 * @param transaccion
	 *
	 * @throws Exception
	 */
	public void  modificar(Long id, CuentaBancaria cuentaBancaria) throws Exception;
	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	List<CuentaBancaria> listarCuentaBancaria() throws Exception;

	/**
	 * método para buscar por id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	CuentaBancaria buscarPorId(Long id) throws Exception;

	/**
	 * método para eliminar de forma lógica
	 * @param id
	 * @throws Exception
	 */
	void eliminar(Long id) throws Exception;

}
