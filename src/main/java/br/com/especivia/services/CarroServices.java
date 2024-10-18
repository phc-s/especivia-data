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
                    carro.set_Id(carroUpdate.get_Id());
                    carro.set_Marca(carroUpdate.get_Marca());
                    carro.set_Modelo(carroUpdate.get_Modelo());
                    carro.set_Portas(carroUpdate.get_Portas());
                    carro.setMotorista_Id(carroUpdate.getMotorista_Id());
                    carro.set_Ano(carroUpdate.get_Ano());
                    carro.set_Quilometragem(carroUpdate.get_Quilometragem());
                    carro.set_Equipamentos(carroUpdate.get_Equipamentos());
                    return carroRepository.save(carro);
                })
                .orElse(null);
    }
    public void deleteCar(Long id) {
        carroRepository.deleteById(id);
    }

}
