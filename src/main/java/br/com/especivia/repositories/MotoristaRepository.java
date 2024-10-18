package br.com.especivia.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.especivia.models.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {

}

