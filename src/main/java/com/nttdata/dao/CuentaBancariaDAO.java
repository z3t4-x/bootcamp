package com.nttdata.dao;

import java.util.Map;

import com.nttdata.domain.CuentaBancaria;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CuentaBancariaDAO implements PanacheRepository<CuentaBancaria>{
   
   
   public CuentaBancaria findByNmCuenta(String nmCuenta){
    return find("nmCuenta", nmCuenta).firstResult();
   } 

 
}
