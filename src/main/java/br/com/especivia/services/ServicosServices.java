package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Servicos;
import br.com.especivia.repositories.ServicosRepository;
import java.util.List;

@Service
public class ServicosServices {

    @Autowired
    private ServicosRepository servicosRepository;

    public List<Servicos> getAllServices()
    {
        return servicosRepository.findAll();
    }
    public Servicos getServiceByID(Long id)
    {
        return servicosRepository.findById(id).orElse(null);
    }
    public Servicos createServices(Servicos servicos) {
        return servicosRepository.save(servicos);
    }

    public Servicos updateServices(Long id, Servicos servicosUpdate) {
        return servicosRepository.findById(id)
                .map(servicos -> {
                    servicos.setMotoristaId(servicosUpdate.getMotoristaId());
                    servicos.setClienteId(servicosUpdate.getClienteId());
                    servicos.setServicosId(servicosUpdate.getServicosId());
                    return servicosRepository.save(servicos);
                })
                .orElse(null);
    }
    public void deleteServices(Long id) {
        servicosRepository.deleteById(id);
    }

}