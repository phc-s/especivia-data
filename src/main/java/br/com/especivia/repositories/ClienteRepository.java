package br.com.especivia.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.especivia.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // JPA Methods to be added...

}
