package com.nttdata.dao;

import com.nttdata.domain.Cliente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface ClienteDAO extends PanacheRepository<Cliente> {

}
