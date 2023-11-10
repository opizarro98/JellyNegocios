package com.ec.jellynegocios.impl;

import com.ec.jellynegocios.dao.Persona;
import com.ec.jellynegocios.repository.PersonaRepository;
import com.ec.jellynegocios.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * @author Oscar Pizarro
 * @since 09/11/2023
 */


@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public Persona crearnuevaPersona(Persona persona) {
        if (personaRepository.existsByCedulaRuc(persona.getCedulaRuc())) {
            return null;
        }
        try{
            return personaRepository.save(persona);
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public List<Persona> listartodaslasPersona() {
        return personaRepository.findAll();
    }

    @Override
    public Persona actualizarDatosDeLaPersona(Long id, Persona persona) {
        Optional<Persona> personaOptional = personaRepository.findById(id);

        if (personaOptional.isPresent()) {
            Persona personaExistente = personaOptional.get();
            personaExistente.setCedulaRuc(persona.getCedulaRuc());
            personaExistente.setNombres(persona.getNombres());
            personaExistente.setApellidos(persona.getApellidos());
            personaExistente.setDireccion(persona.getDireccion());
            personaExistente.setTelefono(persona.getTelefono());
            personaExistente.setDireccion(persona.getDireccion());
            personaExistente.setEmail(persona.getEmail());
            personaExistente.setEs_Activo(persona.getEs_Activo());
            return personaRepository.save(personaExistente);
        } else {
            return null;
        }
    }

    @Override
    public Persona buscarPersonaPorCodigo(String codigo) {
        try{
            return personaRepository.findByCodigo(codigo);
        }catch (Exception e) {
            return null;
        }
    }

    @Override
    public Persona cambiarestadoDeLaPersona(String codigo) {
        Optional<Persona> personaOptional;
        personaOptional = personaRepository.findById(Long.parseLong(codigo));
        if (personaOptional.isPresent()) {
            Persona persona = personaOptional.get();
            if (persona.getEs_Activo().equalsIgnoreCase("S")){
                persona.setEs_Activo("N");
            }else{
                persona.setEs_Activo("S");
            }
            return personaRepository.save(persona);
        } else {
            return null;
        }
    }
}
