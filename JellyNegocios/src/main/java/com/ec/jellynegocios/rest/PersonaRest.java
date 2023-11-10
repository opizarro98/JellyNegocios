package com.ec.jellynegocios.rest;

import com.ec.jellynegocios.dao.Persona;
import com.ec.jellynegocios.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oscar Pizarro
 * @since 09/11/2023
 */
@RestController
@RequestMapping("/persona")
public class PersonaRest {

    @Autowired
    private PersonaService personaService;

    @PostMapping(value = "/crear")
    @ResponseBody
    public ResponseEntity<Persona> crearDatosDeLaEmpresa(@RequestBody Persona persona) {

        Persona nuevaPersona = personaService.crearnuevaPersona(persona);
        if (nuevaPersona != null) {
            return ResponseEntity.ok(nuevaPersona);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> listarPersonas() {
        List<Persona> personas = personaService.listartodaslasPersona();
        if (!personas.isEmpty()) {
            return ResponseEntity.ok(personas);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping(value = "/actualizar/{id}")
    @ResponseBody
    public ResponseEntity<Persona> editraDatosdePersona(@PathVariable Long id, @RequestBody Persona nuevaInformacion) {
        Persona personaActualizada = personaService.actualizarDatosDeLaPersona(id, nuevaInformacion);

        if (personaActualizada != null) {
            return ResponseEntity.ok(personaActualizada);
        } else {
            return ResponseEntity.notFound().build(); // Devuelve una respuesta 404 si no se encuentra la persona
        }
    }

    @GetMapping(value = "/buscar/codigo/{codigo}")
    @ResponseBody
    public ResponseEntity<Persona> buscarPersona(@PathVariable String codigo) {
        Persona persona = personaService.buscarPersonaPorCodigo(codigo);
        if (persona != null) {
            return ResponseEntity.ok(persona);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/cambioestado/codigo/{codigo}")
    @ResponseBody
    public ResponseEntity<Persona> cambiarestadoPersona(@PathVariable String codigo) {
        try{
            Persona persona = personaService.cambiarestadoDeLaPersona(codigo);
            return ResponseEntity.ok(persona);
        }catch (DataAccessException e){
            return ResponseEntity.badRequest().build();
        }
    }
}
