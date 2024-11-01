package com.example.Parcial.Controller;

import com.example.Parcial.Model.Generos;
import com.example.Parcial.Repository.GenerosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/generos")
public class GenerosController {

    @Autowired
    private GenerosRepository generosRepository;

    @GetMapping
    public List<Generos> findAll() {
        return generosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Generos findById(@PathVariable Integer id) {
        return generosRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Generos save(@RequestBody Generos genero) {
        return generosRepository.save(genero);
    }

    @PutMapping("/{id}")
    public Generos update(@PathVariable Integer id, @RequestBody Generos genero) {
        genero.setIdGenero(id);
        return generosRepository.save(genero);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        generosRepository.deleteById(id);
    }
}
