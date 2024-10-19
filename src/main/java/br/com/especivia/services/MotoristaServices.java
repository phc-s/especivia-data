package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Motorista;
import br.com.especivia.repositories.MotoristaRepository;
import java.util.List;

@Service
public class MotoristaServices {

    @Autowired
    private MotoristaRepository motoristaRepository;

    public List<Motorista> getAllDrivers()
    {
        return motoristaRepository.findAll();
    }
    public Motorista getDriverByID(Long id)
    {
        return motoristaRepository.findById(id).orElse(null);
    }
    public Motorista createDriver(Motorista motorista) {
        return motoristaRepository.save(motorista);
    }

    public Motorista updateDriver(Long id, Motorista motoristaUpdate) {
        return motoristaRepository.findById(id)
                .map(motorista -> {
                    motorista.setMotoristaId(motoristaUpdate.getMotoristaId());
                    motorista.setNome(motoristaUpdate.getNome());
                    motorista.setSobrenome(motoristaUpdate.getSobrenome());
                    motorista.setEmail(motoristaUpdate.getEmail());
                    motorista.setEndereco(motoristaUpdate.getEndereco());
                    motorista.setNumero(motoristaUpdate.getNumero());
                    motorista.setCpf(motoristaUpdate.getCpf());
                    motorista.setSenha(motoristaUpdate.getSenha());
                    return motoristaRepository.save(motorista);
                })
                .orElse(null);
    }
    public void deleteDriver(Long id) {
        motoristaRepository.deleteById(id);
    }

}