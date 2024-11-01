package com.example.Parcial.Model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Autores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Integer añoNacimiento;

    @OneToMany(mappedBy = "autor")
    private Set<Libros> libros;

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public Set<Libros> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libros> libros) {
        this.libros = libros;
    }

    public Integer getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


}
