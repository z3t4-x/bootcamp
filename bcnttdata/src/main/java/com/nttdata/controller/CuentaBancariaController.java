package com.nttdata.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.nttdata.domain.CuentaBancaria;
import com.nttdata.services.CuentaBancariaService;

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

@Path("/cuentaBancarias")
@Produces(MediaType.APPLICATION_JSON)
public class CuentaBancariaController {

	@Inject
	private CuentaBancariaService service;

	/**
	 * método para listar
	 * @return
	 * @throws Exception
	 */
	@GET
	public Response listarCuentaBancarias() throws Exception {

		List<CuentaBancaria> lstCuentaBancarias = this.service.listarCuentaBancaria();

		return Response.ok(lstCuentaBancarias).build();
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

		Optional<CuentaBancaria> cuentaBancaria = Optional.of(this.service.buscarPorId(id));

		return cuentaBancaria.map(c  -> Response.ok(c)
				.build())
				.orElse( Response.status(Response.Status.NOT_FOUND).build());



	}


	/**
	 * registrar CuentaBancaria
	 * @param CuentaBancaria
	 * @return
	 * @throws Exception
	 */
	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrarCuentaBancaria(CuentaBancaria cuentaBancaria) throws Exception {

		this.service.registrar(cuentaBancaria);
		return  Response.status(Response.Status.CREATED).build();
	}



	@PUT
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificar(@PathParam("id") Long id,CuentaBancaria cuentaBancaria) throws Exception {

		CuentaBancaria ctBancaria =  this.service.buscarPorId(id);

		if (Objects.isNull(ctBancaria)) {
			throw new WebApplicationException("CuentaBancaria no encontrado, error al intentar modificar el CuentaBancaria", Response.Status.NOT_FOUND);
		}

		this.service.modificar(id, cuentaBancaria);

		return Response.ok(ctBancaria).build();
	}

	@DELETE
	@Transactional
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response eliminarCuentaBancaria(@PathParam("id") Long id, CuentaBancaria cliente) throws Exception {

		CuentaBancaria clie =  this.service.buscarPorId(id);

		if (Objects.isNull(clie.getIdCuenta())) {
			throw new WebApplicationException("Cuenta Bancaria no encontrada, error al intentar modificar La cuenta Bancaria", Response.Status.NOT_FOUND);
		}

		this.service.eliminar(id);

		return Response.ok(clie).build();

	}



}
