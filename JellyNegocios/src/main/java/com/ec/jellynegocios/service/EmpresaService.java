package com.ec.jellynegocios.service;

import com.ec.jellynegocios.dao.Empresa;


/**
 * @author Oscar Pizarro
 * @since 31/10/2023
 */

public interface EmpresaService {

    public Empresa crearDatosEmpresa(Empresa empresa);
    public Empresa buscarDatosEmpresa(Long id);
}
