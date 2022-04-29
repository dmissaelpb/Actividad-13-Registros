package com.app3.app13.entity;

import jdk.jfr.DataAmount;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column()
    private String nombre;

    @Column()
    private String apellido;

    public Persona() {

    }

    public Persona(PersonaDTO personaDTO) {
        this.nombre = personaDTO.getNombre();
        this.apellido = personaDTO.getApellido();

    }

}
