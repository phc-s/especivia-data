package br.com.especivia.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.especivia.models.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

    // JPA Methods to be added...

}
