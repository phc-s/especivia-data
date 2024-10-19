package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Carro;
import br.com.especivia.repositories.CarroRepository;
import java.util.List;

@Service
public class CarroServices {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> getAllCars()
    {
        return carroRepository.findAll();
    }
    public Carro getCarByID(Long id)
    {
        return carroRepository.findById(id).orElse(null);
    }
    public Carro createCar(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro updateCar(Long id, Carro carroUpdate) {
        return carroRepository.findById(id)
                .map(carro -> {
                    carro.setId(carroUpdate.getId());
                    carro.setMarca(carroUpdate.getMarca());
                    carro.setModelo(carroUpdate.getModelo());
                    carro.setPortas(carroUpdate.getPortas());
                    carro.setMotoristaId(carroUpdate.getMotoristaId());
                    carro.setAno(carroUpdate.getAno());
                    carro.setQuilometragem(carroUpdate.getQuilometragem());
                    carro.setEquipamentos(carroUpdate.getEquipamentos());
                    return carroRepository.save(carro);
                })
                .orElse(null);
    }
    public void deleteCar(Long id) {
        carroRepository.deleteById(id);
    }

}
