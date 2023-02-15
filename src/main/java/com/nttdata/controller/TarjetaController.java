package com.nttdata.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.domain.Tarjeta;
import com.nttdata.services.TarjetaService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/tarjetas")
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
	public Response listar() throws Exception {

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
	public Response registrar(Tarjeta tarjeta) throws Exception {

		this.service.registrar(tarjeta);
		return  Response.status(Response.Status.CREATED).build();
	}

	/**
	 * método para modificar
	 * @param id
	 * @param tarjeta
	 * @return
	 * @throws Exception
	 */

	@PUT
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificar(@PathParam("id") Long id,Tarjeta tarjeta) throws Exception {

		Tarjeta tjta =  this.service.buscarPorId(id);

		if (Objects.isNull(tjta)) {
			throw new WebApplicationException("Tarjeta no encontrado, error al intentar modificar el Tarjeta", Response.Status.NOT_FOUND);
		}

		this.service.modificar(id, tjta);

		return Response.ok(tjta).build();
	}


	/**
	 * método para eliminar de forma lógica
	 * @param id
	 * @return
	 * @throws Exception
	 */

	@DELETE
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response eliminar(@PathParam("id") Long id, Tarjeta tarjeta) throws Exception {

		Tarjeta	trj =  this.service.buscarPorId(id);

		if (Objects.isNull(trj.getIdTarjeta())) {
			throw new WebApplicationException("Tarjeta no encontrada, error al intentar eliminar la tarjeta", Response.Status.NOT_FOUND);
		}

		this.service.eliminar(id, tarjeta);

		return Response.ok(trj).build();

	}


}
