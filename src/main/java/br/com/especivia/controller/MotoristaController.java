package br.com.especivia.controller;

import br.com.especivia.models.Motorista;
import br.com.especivia.services.MotoristaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class MotoristaController {

    @Autowired
    private MotoristaServices motoristaServices;

    @GetMapping()
    public List<Motorista> getAllDrivers() {
        return motoristaServices.getAllDrivers();
    }

    @GetMapping("/{id}")
    public Motorista getDriverByID(@PathVariable Long id) {
        return motoristaServices.getDriverByID(id);
    }

    @PostMapping
    public Motorista createDriver(@RequestBody Motorista motorista) {
        return motoristaServices.createDriver(motorista);
    }

    @PutMapping("/{id}")
    public Motorista updateDriver(@PathVariable Long id, @RequestBody Motorista motorista) {
        return motoristaServices.updateDriver(id, motorista);
    }

    @DeleteMapping("/{id}")
    public void deleteDriver(@PathVariable Long id) {
        motoristaServices.deleteDriver(id);
    }

}
