package com.nttdata.dao;

import com.nttdata.domain.Cliente;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteDAO implements PanacheMongoRepository<Cliente> {


}
