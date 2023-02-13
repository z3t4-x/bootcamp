package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.PagoCredito;

public interface PagoCreditoService {

	/**
	 * método para registrar el pago de crédito
	 * @param cliente
	 * @throws Exception
	 */
	public void registrar(PagoCredito pagoCredito) throws Exception;
	/**
	 * método para modificar el pago de crédito
	 * @param cliente
	 * @throws Exception
	 */

	public void  modificar(Long id,PagoCredito pagoCredito) throws Exception;
	/**
	 * método para listar los pagos de credito
	 * @return
	 * @throws Exception
	 */
	List<PagoCredito> listarPagoCredito() throws Exception;

	/**
	 * método para buscar por id de credito
	 * @param id
	 * @return
	 * @throws Exception
	 */
	PagoCredito buscarPorId(Long id) throws Exception;

}
