package br.com.especivia.controller;

import br.com.especivia.models.Carro;
import br.com.especivia.services.CarroServices;
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
public class CarroController {

    @Autowired
    private CarroServices carroServices;

    @GetMapping()
    public List<Carro> getAllCars() {
        return carroServices.getAllCars();
    }

    @GetMapping("/{id}")
    public Carro getCarByID(@PathVariable Long id) {
        return carroServices.getCarByID(id);
    }

    @PostMapping
    public Carro createCar(@RequestBody Carro carro) {
        return carroServices.createCar(carro);
    }

    @PutMapping("/{id}")
    public Carro updateCar(@PathVariable Long id, @RequestBody Carro carro) {
        return carroServices.updateCar(id, carro);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carroServices.deleteCar(id);
    }

}
