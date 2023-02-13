package com.nttdata.dao;

import com.nttdata.domain.CuentaCliente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CuentaClienteDAO implements PanacheRepository<CuentaCliente>{

}
