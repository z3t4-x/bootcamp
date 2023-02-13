package com.nttdata.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.domain.Cliente;
import com.nttdata.services.ClienteService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
public class ClienteController {

	@Inject
	private ClienteService service;

	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	@GET
	public Response listarClientes() throws Exception {

		List<Cliente> lstClientes = this.service.listarCliente();

		return Response.ok(lstClientes).build();
	}


	@GET
	@Path("{id}")
	public Response buscarId(@PathParam("id") Long id) throws Exception {

		Optional<Cliente> cliente = Optional.of(this.service.buscarPorId(id));

		return cliente.map(c  -> Response.ok(c)
				.build())
				.orElse( Response.status(Response.Status.NOT_FOUND).build());



	}


	/**
	 * registrar cliente
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrarCliente(Cliente cliente) throws Exception {

		this.service.registrar(cliente);
		return  Response.status(Response.Status.CREATED).build();
	}



	@PUT
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response modificarCliente(@PathParam("id") Long id,Cliente cliente) throws Exception {

		Cliente clie =  this.service.buscarPorId(id);

		if (Objects.isNull(clie.getIdCliente())) {
			throw new WebApplicationException("Cliente no encontrado, error al intentar modificar el cliente", Response.Status.NOT_FOUND);
		}

		this.service.modificar(id, cliente);

		return Response.ok(clie).build();
	}





}
