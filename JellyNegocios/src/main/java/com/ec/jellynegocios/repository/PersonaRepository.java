package com.ec.jellynegocios.repository;

import com.ec.jellynegocios.dao.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Oscar Pizarro
 * @since 09/11/2023
 */

public interface PersonaRepository  extends JpaRepository<Persona, Long> {

    @Query("from Persona")
    Persona findByCodigo(String codigo);

    boolean existsByCedulaRuc(String cedulaRuc);
}
