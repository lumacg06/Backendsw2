package com.apirests2.backends2.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirests2.backends2.models.Registro;
import com.apirests2.backends2.repositories.RegistroRepository;

@RestController
@RequestMapping("/api/registros")
public class RegistroController {

    @Autowired
    private RegistroRepository registroRepository;

    @GetMapping
    public List <Registro> obtenerTodosLosRegistros(){
        return registroRepository.findAll();
    }

    @GetMapping("/{idregistro}")
    public Registro obtenerUsuarioPoridRegistro(@PathVariable Long idregistro){
        return registroRepository.findById(idregistro).orElse(null);     
    }
    @PostMapping
    public Registro crearRegistro(@RequestBody Registro registro){
        return registroRepository.save(registro);
    }
    @PutMapping("/{idregistro}")
    public Registro actualizarRegistro(@PathVariable Long idregistro, @RequestBody Registro registro){
        registro.setIdregistro(idregistro);
        return registroRepository.save(registro);
    }
    @DeleteMapping("/{idregistro}")
    public void eliminarRegistro(@PathVariable Long idregistro){
        registroRepository.deleteById(idregistro);
    }

}
