package com.nttdata.dao;

import com.nttdata.domain.CatalogosValores;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class CatalogosValoresDAO implements PanacheMongoRepository<CatalogosValores>{

}
