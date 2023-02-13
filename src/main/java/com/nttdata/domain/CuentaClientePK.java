package com.nttdata.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CuentaClientePK implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * id cuenta bancaria
	 */
	@ManyToOne
	@JoinColumn(name ="ID_CUENTA", nullable =  false)
	private CuentaBancaria cuentaBancaria;	/**


	/**
	 * IDentifica el tipo de cliente si es juridico o natural
	 */
	@ManyToOne
	@JoinColumn(name ="ID_CLIENTE", nullable =  false)
	private Cliente cliente;







	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return this.cliente;
	}


	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	/**
	 * @return the cuentaBancaria
	 */
	public CuentaBancaria getCuentaBancaria() {
		return this.cuentaBancaria;
	}


	/**
	 * @param cuentaBancaria the cuentaBancaria to set
	 */
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.cliente == null) ? 0 : this.cliente.hashCode());
		result = prime * result + ((this.cuentaBancaria == null) ? 0 : this.cuentaBancaria.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		CuentaClientePK other = (CuentaClientePK) obj;
		if (this.cliente == null) {
			if (other.cliente != null) {
				return false;
			}
		} else if (!this.cliente.equals(other.cliente)) {
			return false;
		}
		if (this.cuentaBancaria == null) {
			if (other.cuentaBancaria != null) {
				return false;
			}
		} else if (!this.cuentaBancaria.equals(other.cuentaBancaria)) {
			return false;
		}
		return true;
	}




}
