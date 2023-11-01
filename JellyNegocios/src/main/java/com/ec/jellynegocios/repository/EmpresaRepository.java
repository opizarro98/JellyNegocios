package com.ec.jellynegocios.repository;

import com.ec.jellynegocios.dao.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Oscar Pizarro
 * @since 31/10/2023
 */


@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {


}
