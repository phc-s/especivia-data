package br.com.especivia.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.especivia.models.Servicos;

@Repository
public interface ServicosRepository extends JpaRepository<Servicos, Long> {

}
