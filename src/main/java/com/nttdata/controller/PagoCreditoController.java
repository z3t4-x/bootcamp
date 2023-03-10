package com.nttdata.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.domain.PagoCredito;
import com.nttdata.services.PagoCreditoService;

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

@Path("/PagoCredito")
@Produces(MediaType.APPLICATION_JSON)
public class PagoCreditoController {

	@Inject
	private PagoCreditoService service;

	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	@GET
	public Response listarPagoCredito() throws Exception {

		List<PagoCredito> lstPagoCredito = this.service.listarPagoCredito();

		return Response.ok(lstPagoCredito).build();
	}

	/**
	 * buscar por id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path("{id}")
	public Response buscarId(@PathParam("id") Long id) throws Exception {

		Optional<PagoCredito> pagoCredito = Optional.of(this.service.buscarPorId(id));

		return pagoCredito.map(c  -> Response.ok(c)
				.build())
				.orElse( Response.status(Response.Status.NOT_FOUND).build());



	}


	/**
	 * registrar PagoCredito
	 * @param PagoCredito
	 * @return
	 * @throws Exception
	 */
	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrar(PagoCredito pagoCredito) throws Exception {

		this.service.registrar(pagoCredito);
		return  Response.status(Response.Status.CREATED).build();
	}



	@PUT
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificar(@PathParam("id") Long id,PagoCredito pagoCredito) throws Exception {

		PagoCredito pgCredito =  this.service.buscarPorId(id);

		if (Objects.isNull(pgCredito)) {
			throw new WebApplicationException("PagoCredito no encontrado, error al intentar modificar", Response.Status.NOT_FOUND);
		}

		this.service.modificar(id, pgCredito);

		return Response.ok(pgCredito).build();
	}





}
