package com.example.Parcial.Controller;

import com.example.Parcial.Model.Autores;
import com.example.Parcial.Repository.AutoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutoresController {

    @Autowired
    private AutoresRepository autoresRepository;

    @GetMapping
    public List<Autores> findAll() {
        return autoresRepository.findAll();
    }

    @GetMapping("/{id}")
    public Autores findById(@PathVariable Integer id) {
        return autoresRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Autores save(@RequestBody Autores autor) {
        return autoresRepository.save(autor);
    }

    @PutMapping("/{id}")
    public Autores update(@PathVariable Integer id, @RequestBody Autores autor) {
        autor.setIdAutor(id);
        return autoresRepository.save(autor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        autoresRepository.deleteById(id);
    }
}
