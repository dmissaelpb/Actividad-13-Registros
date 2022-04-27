package com.app3.app13.controller;

import com.app3.app13.entity.Persona;
import com.app3.app13.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas")
    @ResponseStatus(HttpStatus.OK)
    public List<Persona> getPersonas(){
        return personaService.findAll();
    }

    @PostMapping("/guardar_personas")
    public ResponseEntity<Void> agregarPersona(@RequestBody Persona persona){
        if(personaService.findById(persona.getId())==null) {
            personaService.save(persona);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }



}
