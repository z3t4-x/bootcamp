package com.nttdata.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.domain.Catalogos;
import com.nttdata.services.CatalogosService;

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

@Path("/catalogos")
@Produces(MediaType.APPLICATION_JSON)
public class CatalogosController {

	@Inject
	private CatalogosService service;

	/**
	 * método para listar
	 *
	 * @return
	 * @throws Exception
	 */
	@GET
	public Response listarCatalogoss() throws Exception {

		List<Catalogos> lstCatalogos = this.service.listar();

		return Response.ok(lstCatalogos).build();
	}

	/**
	 * buscar por id
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
	/*@GET
	@Path("{id}")
	public Response buscarId(@PathParam("id") Long id) throws Exception {

		Optional<Catalogos> catalogos = Optional.of(this.service.buscarPorId(id));

		return catalogos.map(c -> Response.ok(c).build()).orElse(Response.status(Response.Status.NOT_FOUND).build());

	}*/

	/**
	 * registrar Catalogos
	 *
	 * @param Catalogos
	 * @return
	 * @throws Exception
	 */
	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrarCatalogos(Catalogos catalogos) throws Exception {

		this.service.registrar(catalogos);
		return Response.status(Response.Status.CREATED).build();
	}
	/**
	 * método para editar
	 * @param id
	 * @param catalogos
	 * @return
	 * @throws Exception
	 */
/*/	@PUT
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificarCatalogos(@PathParam("id") Long id, Catalogos catalogos) throws Exception {

		Catalogos cat = this.service.buscarPorId(id);

		if (Objects.isNull(cat)) {
			throw new WebApplicationException("Catalogos no encontrado, error al intentar modificar el Catalogos",
					Response.Status.NOT_FOUND);
		}

		this.service.modificar(id, cat);

		return Response.ok(cat).build();
	}*/

}
