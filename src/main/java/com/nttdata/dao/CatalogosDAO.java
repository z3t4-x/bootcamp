package com.nttdata.dao;

import com.nttdata.domain.Catalogos;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class CatalogosDAO implements PanacheRepository<Catalogos>{

}
