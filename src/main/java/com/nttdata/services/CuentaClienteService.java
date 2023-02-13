package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.CuentaCliente;



public interface CuentaClienteService {


	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	List<CuentaCliente> listarCuentaCliente() throws Exception;



}
