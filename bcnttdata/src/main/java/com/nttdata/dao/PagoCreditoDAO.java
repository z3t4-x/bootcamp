package com.nttdata.dao;

import com.nttdata.domain.PagoCredito;

import io.quarkus.hibernate.orm.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoCreditoDAO implements PanacheMongoRepository<PagoCredito>{

}
