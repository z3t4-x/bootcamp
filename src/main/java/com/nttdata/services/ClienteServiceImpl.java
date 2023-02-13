package com.nttdata.services;

import java.util.List;
import java.util.Objects;

import com.nttdata.dao.ClienteDAO;
import com.nttdata.domain.Cliente;
import com.nttdata.utils.Constantes;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ClienteServiceImpl implements ClienteService{


	@Inject
	private ClienteDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public void registrar(Cliente cliente) throws Exception {

		Cliente c =  new Cliente();
		// cliente jurídico
		if(Constantes.tipoCliente.PERSONA_JURIDICA.equals(cliente.getTipoCliente().getIdValor())) {
			c.setRazonSocial(cliente.getRazonSocial());
			c.setRuc(cliente.getRuc());
			c.setDireccion(cliente.getDireccion());
			c.setCorreo(cliente.getCorreo());
			c.setTelefono(cliente.getTelefono());
			c.setTipoCliente(cliente.getTipoCliente());


		}
		// cliente natural
		if(Constantes.tipoCliente.PERSONA_NATURAL.equals(cliente.getTipoCliente().getIdValor())) {
			c.setNombre(cliente.getNombre());
			c.setDni(cliente.getDni());
			c.setApellido1(cliente.getApellido1());
			c.setApellido2(cliente.getApellido2());
			c.setFcNacimiento(cliente.getFcNacimiento());
			c.setTipoCliente(cliente.getTipoCliente());
		}

		this.dao.persist(cliente);
	}
	/**
	 *
	 */
	@Override
	@Transactional
	public void modificar(Long id, Cliente cliente) throws Exception {


		Cliente c = this.dao.findById(id);


		if(Objects.isNull(c )) {
			throw new NullPointerException("Error, no se ha podido modificar");
		}

		if(Constantes.tipoCliente.PERSONA_JURIDICA.equals(cliente.getTipoCliente().getIdValor())) {
			c.setRazonSocial(cliente.getRazonSocial());
			c.setRuc(cliente.getRuc());
			c.setDireccion(cliente.getDireccion());
			c.setCorreo(cliente.getCorreo());
			c.setTelefono(cliente.getTelefono());
			c.setTipoCliente(cliente.getTipoCliente());
			this.dao.persist(c);

		}

		if(Constantes.tipoCliente.PERSONA_NATURAL.equals(cliente.getTipoCliente().getIdValor())) {
			c.setNombre(cliente.getNombre());
			c.setDni(cliente.getDni());
			c.setApellido1(cliente.getApellido1());
			c.setApellido2(cliente.getApellido2());
			c.setFcNacimiento(cliente.getFcNacimiento());
			c.setTipoCliente(cliente.getTipoCliente());
			c.setDireccion(cliente.getDireccion());
			c.setCorreo(cliente.getCorreo());
			c.setTelefono(cliente.getTelefono());

			this.dao.persist(c);
		}



	}



	/**
	 *
	 */
	@Override
	public List<Cliente> listarCliente() throws Exception {

		return this.dao.findAll().list();
	}
	/**
	 *
	 */
	@Override
	public Cliente buscarPorId(Long id) throws Exception {

		return this.dao.findByIdOptional(id).orElse(null);
	}


}
