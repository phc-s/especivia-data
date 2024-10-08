package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Avaliacao;
import br.com.especivia.repositories.AvaliacaoRepository;

@Service
public class AvaliacaoServices {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

}
