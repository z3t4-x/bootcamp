package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.CuentaBancaria;
import com.nttdata.domain.Tarjeta;

public interface TarjetaService {
	/**
	 * método para registrar
	 * @param cliente
	 * @throws Exception
	 */
	public void registrar(Tarjeta tarjeta) throws Exception;
	/**
	 * modificar
	 * @param id
	 * @param tarjeta
	 * @throws Exception
	 */

	public Tarjeta  modificar(Long id, Tarjeta tarjeta) throws Exception;
	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	List<Tarjeta> listar() throws Exception;

	/**
	 * método para buscar por id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Tarjeta buscarPorId(Long id) throws Exception;


	/**
	 * eliminar de forma lógica
	 * @param id
	 *
	 * @throws Exception
	 */
	public void  eliminar(Long id, Tarjeta tarjeta) throws Exception;
	
	
	/**
	 * deposito en cuenta / Consultar datos de cuenta,  (principal o secundaria)
	 * @param numTarjeta numCuenta deposito(opc)
	 *
	 * @throws Exception
	 */
	public CuentaBancaria  operaciones(Long numTarjeta, Long numCuenta, Double deposito, String opcionOperacion) throws Exception;

}