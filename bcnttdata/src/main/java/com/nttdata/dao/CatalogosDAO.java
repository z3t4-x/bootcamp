package com.nttdata.dao;

import com.nttdata.domain.Catalogos;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class CatalogosDAO implements PanacheMongoRepository<Catalogos>{

}
