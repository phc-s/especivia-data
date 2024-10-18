package br.com.especivia.controller;

import br.com.especivia.models.Avaliacao;
import br.com.especivia.services.AvaliacaoServices;
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
public class AvaliacaoController {

    @Autowired
    private AvaliacaoServices avaliacaoServices;

    @GetMapping()
    public List<Avaliacao> getAllRatings() {
        return avaliacaoServices.getAllRatings();
    }

    @GetMapping("/{id}")
    public Avaliacao getRatingByID(@PathVariable Long id) {
        return avaliacaoServices.getRatingByID(id);
    }

    @PostMapping
    public Avaliacao createRating(@RequestBody Avaliacao avaliacao) {
        return avaliacaoServices.createRating(avaliacao);
    }

    @PutMapping("/{id}")
    public Avaliacao updateRating(@PathVariable Long id, @RequestBody Avaliacao avaliacao) {
        return avaliacaoServices.updateRating(id, avaliacao);
    }

    @DeleteMapping("/{id}")
    public void deleteRating(@PathVariable Long id) {
        avaliacaoServices.deleteRating(id);
    }

}
