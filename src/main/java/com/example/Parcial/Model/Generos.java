package com.example.Parcial.Model;

import jakarta.persistence.*;
import java.util.Set;


@Entity
public class Generos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGenero;

    private String nombreGenero;

    // Constructor, getters y setters
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
}