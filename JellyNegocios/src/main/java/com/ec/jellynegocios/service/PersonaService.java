package com.ec.jellynegocios.service;


import com.ec.jellynegocios.dao.Persona;

import java.util.List;

/**
 * @author Oscar Pizarro
 * @since 09/11/2023
 */
public interface PersonaService {

    public Persona crearnuevaPersona (Persona persona);

    public List<Persona> listartodaslasPersona() ;

    public Persona actualizarDatosDeLaPersona (Long id, Persona persona);

    public Persona buscarPersonaPorCodigo (String codigo);

    public Persona cambiarestadoDeLaPersona (String codigo);
}
