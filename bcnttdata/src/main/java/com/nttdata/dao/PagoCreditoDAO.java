package com.nttdata.dao;

import com.nttdata.domain.PagoCredito;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoCreditoDAO implements PanacheRepository<PagoCredito>{

}
