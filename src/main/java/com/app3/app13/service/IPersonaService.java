package com.app3.app13.service;

import com.app3.app13.entity.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Persona> findAll();
    public void save(Persona persona);
    public Persona findById (Long id);
}
//full