package com.ec.jellynegocios.impl;

import com.ec.jellynegocios.dao.Empresa;
import com.ec.jellynegocios.repository.EmpresaRepository;
import com.ec.jellynegocios.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Oscar Pizarro
 * @since 31/10/2023
 */


@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Empresa crearDatosEmpresa(Empresa empresa) {
        try {
            return empresaRepository.save(empresa);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Empresa buscarDatosEmpresa(Long id) {
        try {
            return empresaRepository.findById_empresa(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
