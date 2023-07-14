package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "carrera",path="carrera")
public interface CarreraRepository extends PagingAndSortingRepository<Curso, Integer>,CrudRepository<Curso, Integer> {


    List<Curso>findByNombre(@Param("nombre") String nombre);
    
}
