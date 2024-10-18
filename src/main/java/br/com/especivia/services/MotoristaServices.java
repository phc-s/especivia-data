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
                    motorista.setMotorista_Id(motoristaUpdate.getMotorista_Id());
                    motorista.set_Nome(motoristaUpdate.get_Nome());
                    motorista.set_Sobrenome(motoristaUpdate.get_Sobrenome());
                    motorista.set_Email(motoristaUpdate.get_Email());
                    motorista.set_Endereco(motoristaUpdate.get_Endereco());
                    motorista.set_Numero(motoristaUpdate.get_Numero());
                    motorista.set_cpf(motoristaUpdate.get_cpf());
                    motorista.set_Senha(motoristaUpdate.get_Senha());
                    return motoristaRepository.save(motorista);
                })
                .orElse(null);
    }
    public void deleteDriver(Long id) {
        motoristaRepository.deleteById(id);
    }

}