package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Motorista;
import br.com.especivia.repositories.MotoristaRepository;

@Service
public class MotoristaServices {

    @Autowired
    private MotoristaRepository motoristaRepository;

}