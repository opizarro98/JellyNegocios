package com.ec.jellynegocios.rest;


import com.ec.jellynegocios.dao.Empresa;
import com.ec.jellynegocios.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * @author Oscar Pizarro
 * @since 31/10/2023
 */
@RestController
@RequestMapping("/empresa")
public class EmpresaRest {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping(value = "/datosEmpresa")
    @ResponseBody
    public ResponseEntity<Empresa> crearDatosEmpresa(@RequestBody  Empresa empresa) {
        try{
            Empresa datosEmpresa = empresaService.crearDatosDeLaEmpresa(empresa);
            return ResponseEntity.ok(datosEmpresa);
        }catch (DataAccessException e){
            return ResponseEntity.badRequest().build();
        }



    }
}
