package com.app3.app13.service;

public class PersonaServiceImpl {



    @Autowired
    PersonaRepository personaRepository;

    public Iterable<Persona> getPersona() {
        return personaRepository.findAll();
    }

    public Optional<Persona> getPersonaById(Integer id) {
        return personaRepository.findById(id);
    }

    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona actualizarPersona(Integer id, Persona persona) {
        persona.setId(id);
        return personaRepository.save(persona);
    }

    public void borrarPersona(Integer id) {
        Optional<Persona> persona = personaRepository.findById(id);
        personaRepository.delete(persona.get());

    }
}
