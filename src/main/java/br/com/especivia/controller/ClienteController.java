package br.com.especivia.controller;

import br.com.especivia.models.Cliente;
import br.com.especivia.services.ClienteServices;
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
public class ClienteController {

    @Autowired
    private ClienteServices clienteServices;

    @GetMapping()
    public List<Cliente> getAllClients() {
        return clienteServices.getAllClients();
    }

    @GetMapping("/{id}")
    public Cliente getClientByID(@PathVariable Long id) {
        return clienteServices.getClientByID(id);
    }

    @PostMapping
    public Cliente createClient(@RequestBody Cliente client) {
        return clienteServices.createClient(client);
    }

    @PutMapping("/{id}")
    public Cliente updateClient(@PathVariable Long id, @RequestBody Cliente client) {
        return clienteServices.updateClient(id, client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clienteServices.deleteClient(id);
    }

}
