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
                    cliente.setClienteId(clienteUpdate.getClienteId());
                    cliente.setNome(clienteUpdate.getNome());
                    cliente.setSobrenome(clienteUpdate.getSobrenome());
                    cliente.setEmail(clienteUpdate.getEmail());
                    cliente.setEndereco(clienteUpdate.getEndereco());
                    cliente.setNumero(clienteUpdate.getNumero());
                    cliente.setCpf(clienteUpdate.getCpf());
                    cliente.setSenha(clienteUpdate.getSenha());
                    return clienteRepository.save(cliente);
                })
                .orElse(null);
    }
    public void deleteClient(Long id) {
        clienteRepository.deleteById(id);
    }


}
