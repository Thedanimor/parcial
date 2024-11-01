package com.example.Parcial.Controller;

import com.example.Parcial.Model.Clientes;
import com.example.Parcial.Repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping
    public List<Clientes> findAll() {
        return clientesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Clientes findById(@PathVariable Integer id) {
        return clientesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Clientes save(@RequestBody Clientes cliente) {
        return clientesRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Clientes update(@PathVariable Integer id, @RequestBody Clientes cliente) {
        cliente.setIdCliente(id);
        return clientesRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        clientesRepository.deleteById(id);
    }
}
