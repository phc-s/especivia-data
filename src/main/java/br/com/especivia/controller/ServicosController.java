package br.com.especivia.controller;

import br.com.especivia.models.Servicos;
import br.com.especivia.services.ServicosServices;
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
public class ServicosController {

    @Autowired
    private ServicosServices servicosServices;

    @GetMapping()
    public List<Servicos> getAllServices() {
        return servicosServices.getAllServices();
    }

    @GetMapping("/{id}")
    public Servicos getServicesByID(@PathVariable Long id) {
        return servicosServices.getServiceByID(id);
    }

    @PostMapping
    public Servicos createServices(@RequestBody Servicos servicos) {
        return servicosServices.createServices(servicos);
    }

    @PutMapping("/{id}")
    public Servicos updateServices(@PathVariable Long id, @RequestBody Servicos servicos) {
        return servicosServices.updateServices(id, servicos);
    }

    @DeleteMapping("/{id}")
    public void deleteServices(@PathVariable Long id) {
        servicosServices.deleteServices(id);
    }

}
