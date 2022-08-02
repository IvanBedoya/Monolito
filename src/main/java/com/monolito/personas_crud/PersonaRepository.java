package com.monolito.personas_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    @Query(value = "SELECT" +
            "*" +
            "FROM" +
            "PERSONAS A" +
            "DOCUMENTOS B" +
            "CIUDADES C" +
            "TIPO_DOC D" +
            "WHERE" +
            "D.NUMERO = "
    )
}
