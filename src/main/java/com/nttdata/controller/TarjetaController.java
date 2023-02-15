package com.nttdata.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.domain.Tarjeta;
import com.nttdata.services.TarjetaService;

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

@Path("/tarjeta")
@Produces(MediaType.APPLICATION_JSON)
public class TarjetaController {

	@Inject
	private TarjetaService service;

	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	@GET
	public Response listarTarjetas() throws Exception {

		List<Tarjeta> lstTarjeta = this.service.listar();

		return Response.ok(lstTarjeta).build();
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

		Optional<Tarjeta> tarjeta = Optional.of(this.service.buscarPorId(id));

		return tarjeta.map(c  -> Response.ok(c)
				.build())
				.orElse( Response.status(Response.Status.NOT_FOUND).build());
	}


	/**
	 * registrar Tarjeta
	 * @param Tarjeta
	 * @return
	 * @throws Exception
	 */
	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrar(Tarjeta Tarjeta) throws Exception {

		//this.service.registrar(Tarjeta);
		return  Response.status(Response.Status.CREATED).build();
	}



	@PUT
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificar(@PathParam("id") Long id,Tarjeta Tarjeta) throws Exception {

		Tarjeta ctaBancaria =  this.service.buscarPorId(id);

		if (Objects.isNull(ctaBancaria)) {
			throw new WebApplicationException("Tarjeta no encontrado, error al intentar modificar el Tarjeta", Response.Status.NOT_FOUND);
		}

		this.service.modificar(id, ctaBancaria);

		return Response.ok(ctaBancaria).build();
	}

}
