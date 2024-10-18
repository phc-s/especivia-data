package br.com.especivia.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.especivia.models.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
