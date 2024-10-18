package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Cliente;
import br.com.especivia.repositories.ClienteRepository;
import java.util.List;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClients()
    {
        return clienteRepository.findAll();
    }
    public Cliente getClientByID(Long id)
    {
        return clienteRepository.findById(id).orElse(null);
    }
    public Cliente createClient(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente updateClient(Long id, Cliente clienteUpdate) {
        return clienteRepository.findById(id)
                .map(cliente -> {
                    cliente.setCliente_Id(clienteUpdate.getCliente_Id());
                    cliente.set_Nome(clienteUpdate.get_Nome());
                    cliente.set_Sobrenome(clienteUpdate.get_Sobrenome());
                    cliente.set_Email(clienteUpdate.get_Email());
                    cliente.set_Endereco(clienteUpdate.get_Endereco());
                    cliente.set_Numero(clienteUpdate.get_Numero());
                    cliente.set_cpf(clienteUpdate.get_cpf());
                    cliente.set_Senha(clienteUpdate.get_Senha());
                    return clienteRepository.save(cliente);
                })
                .orElse(null);
    }
    public void deleteClient(Long id) {
        clienteRepository.deleteById(id);
    }


}
