package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Servicos;
import br.com.especivia.repositories.ServicosRepository;

@Service
public class ServicosServices {

    @Autowired
    private ServicosRepository servicosRepository;

}