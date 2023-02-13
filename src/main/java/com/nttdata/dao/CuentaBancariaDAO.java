package com.nttdata.dao;

import com.nttdata.domain.CuentaBancaria;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CuentaBancariaDAO implements PanacheRepository<CuentaBancaria>{

}
