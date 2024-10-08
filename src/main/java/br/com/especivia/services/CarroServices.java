package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Carro;
import br.com.especivia.repositories.CarroRepository;

@Service
public class CarroServices {

    @Autowired
    private CarroRepository carroRepository;

}
