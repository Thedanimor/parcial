package com.example.Parcial.Controller;

import com.example.Parcial.Model.Prestamos;
import com.example.Parcial.Repository.PrestamosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamosController {

    @Autowired
    private PrestamosRepository prestamosRepository;

    @GetMapping
    public List<Prestamos> findAll() {
        return prestamosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Prestamos findById(@PathVariable Integer id) {
        return prestamosRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Prestamos save(@RequestBody Prestamos prestamo) {
        return prestamosRepository.save(prestamo);
    }

    @PutMapping("/{id}")
    public Prestamos update(@PathVariable Integer id, @RequestBody Prestamos prestamo) {
        prestamo.setIdPrestamo(id);
        return prestamosRepository.save(prestamo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        prestamosRepository.deleteById(id);
    }
}
