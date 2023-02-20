package com.nttdata.dao;

import com.nttdata.domain.CuentaBancaria;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CuentaBancariaDAO implements PanacheMongoRepository<CuentaBancaria>{
   
   
   public CuentaBancaria findByNmCuenta(String nmCuenta){
    return find("nmCuenta", nmCuenta).firstResult();
   } 

}
