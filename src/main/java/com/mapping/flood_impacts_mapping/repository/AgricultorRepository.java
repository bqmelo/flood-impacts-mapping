package com.mapping.flood_impacts_mapping.repository;

import com.mapping.flood_impacts_mapping.entity.Agricultor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgricultorRepository extends CrudRepository<Agricultor, Integer> {

    @Query("SELECT a FROM Agricultor a WHERE (:razaoSocial IS NULL OR a.razaoSocial LIKE %:razaoSocial%)")
    List<Agricultor> findAgricultoresByFilters(String razaoSocial);
}
