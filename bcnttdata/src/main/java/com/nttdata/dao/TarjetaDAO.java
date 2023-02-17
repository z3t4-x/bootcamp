package com.nttdata.dao;

import com.nttdata.domain.Tarjeta;

import io.quarkus.hibernate.orm.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class TarjetaDAO implements PanacheMongoRepository<Tarjeta>{

}
