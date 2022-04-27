package com.app3.app13.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Persona implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String nombres;
    private String apellidos;
    private int edad;
    private String sexo;
    private double estatura;
    private double peso;
    private double imc;
    private Date fecha;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
