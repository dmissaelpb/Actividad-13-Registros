package com.app3.app13.service;

import com.app3.app13.dao.IPersonaDAO;
import com.app3.app13.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDAO personaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return (List<Persona>) personaDAO.findAll();
    }


    @Override
    public void save(Persona persona) {
        personaDAO.save(persona);
    }

    @Override
    public Persona findById(Long id) {
        return personaDAO.findById(id).orElse(null);
    }


}
