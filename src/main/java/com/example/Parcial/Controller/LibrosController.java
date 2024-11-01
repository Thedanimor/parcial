package com.example.Parcial.Controller;

import com.example.Parcial.Model.Libros;
import com.example.Parcial.Repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibrosController {

    @Autowired
    private LibrosRepository librosRepository;

    @GetMapping
    public List<Libros> findAll() {
        return librosRepository.findAll();
    }

    @PostMapping
    public Libros save(@RequestBody Libros libro) {
        return librosRepository.save(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        librosRepository.deleteById(id);
    }
}
