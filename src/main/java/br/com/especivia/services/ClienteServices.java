package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Cliente;
import br.com.especivia.repositories.ClienteRepository;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

}
