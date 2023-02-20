package com.nttdata.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.domain.CatalogosValores;
import com.nttdata.services.CatalogosValoresService;

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

@Path("/catalogosValores")
@Produces(MediaType.APPLICATION_JSON)
public class CatalogosValoresController {

	@Inject
	private CatalogosValoresService service;

	/**
	 * método para listar
	 *
	 * @return
	 * @throws Exception
	 */
	@GET
	public Response listarCatalogosValoress() throws Exception {

		List<CatalogosValores> lstCatalogosValores = this.service.listar();

		return Response.ok(lstCatalogosValores).build();
	}

	/**
	 * buscar por id
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
/*	@GET
	@Path("{id}")
	public Response buscarId(@PathParam("id") Long id) throws Exception {

		Optional<CatalogosValores> catalogosValores = Optional.of(this.service.buscarPorId(id));

		return catalogosValores.map(c -> Response.ok(c).build()).orElse(Response.status(Response.Status.NOT_FOUND).build());

	}*/

	/**
	 * registrar CatalogosValores
	 *
	 * @param CatalogosValores
	 * @return
	 * @throws Exception
	 */
	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrarCatalogosValores(CatalogosValores catalogosValores) throws Exception {

		this.service.registrar(catalogosValores);
		return Response.status(Response.Status.CREATED).build();
	}
	/**
	 * método para editar
	 * @param id
	 * @param CatalogosValores
	 * @return
	 * @throws Exception
	 */
/*	@PUT
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificarCatalogosValores(@PathParam("id") Long id, CatalogosValores CatalogosValores) throws Exception {

		CatalogosValores cat = this.service.buscarPorId(id);

		if (Objects.isNull(cat)) {
			throw new WebApplicationException("CatalogosValores no encontrado, error al intentar modificar",
					Response.Status.NOT_FOUND);
		}

		this.service.modificar(id, cat);

		return Response.ok(cat).build();
	}*/

}
