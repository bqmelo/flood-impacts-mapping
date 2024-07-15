package com.mapping.flood_impacts_mapping.repository;

import com.mapping.flood_impacts_mapping.entity.Dano;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanoRepository extends CrudRepository<Dano, Integer> {

    @Query("SELECT d FROM Dano d WHERE d.agricultor.idAgricultor = :idAgricultor")
    List<Dano> findByAgricultorIdAgricultor(@Param("idAgricultor") int idAgricultor);

    @Query("SELECT d FROM Dano d WHERE d.resolvido = :isSolved")
    List<Dano> findIsResolved(@Param("isSolved") Boolean isSolved);

    @Query("SELECT d FROM Dano d WHERE d.agricultor.idAgricultor = :idAgricultor AND d.resolvido = :isSolved")
    List<Dano> findByAgricultorIdAndIsSolved(@Param("idAgricultor") int idAgricultor, @Param("isSolved") Boolean isSolved);

    @Query("SELECT d FROM Dano d WHERE d.plantacao.tipoCultura.descricao LIKE CONCAT('%', :cultura, '%')")
    List<Dano> findByCultura(@Param("cultura") String cultura);

    @Query("SELECT d FROM Dano d WHERE d.plantacao.tipoCultura.descricao LIKE CONCAT('%', :cultura, '%')" +
            "AND d.resolvido = :isSolved")
    List<Dano> findByCulturaAndIsSolved(@Param("cultura") String cultura, @Param("isSolved") Boolean isSolved);

    @Query("SELECT d FROM Dano d LEFT JOIN Seguradora s ON d.idDano = s.dano.idDano WHERE s.idSeguradora IS NULL")
    List<Dano> findDanosWithoutSeguradora();
}
