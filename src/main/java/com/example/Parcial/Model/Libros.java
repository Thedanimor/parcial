package com.example.Parcial.Model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibro;

    private String titulo;
    private Integer añoPublicacion;
    private String isbn;
    private Boolean disponibilidad;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autores autor;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Generos genero;

    @OneToMany(mappedBy = "libro")
    private Set<Prestamos> prestamos;

    // Getters y Setters
}
