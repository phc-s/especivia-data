package br.com.especivia.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.especivia.models.Avaliacao;
import br.com.especivia.repositories.AvaliacaoRepository;
import java.util.List;

@Service
public class AvaliacaoServices {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> getAllRatings()
    {
        return avaliacaoRepository.findAll();
    }
    public Avaliacao getRatingByID(Long avaliacao_id)
    {
        return avaliacaoRepository.findById(avaliacao_id).orElse(null);
    }
    public Avaliacao createRating(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public Avaliacao updateRating(Long id, Avaliacao avaliacaoUpdate) {
        return avaliacaoRepository.findById(id)
                .map(avaliacao -> {
                    avaliacao.set_Avaliacao(avaliacaoUpdate.get_Avaliacao());
                    avaliacao.set_Tags(avaliacaoUpdate.get_Tags());
                    avaliacao.set_Estrelas(avaliacaoUpdate.get_Estrelas());
                    avaliacao.setMotorista_Id(avaliacaoUpdate.getMotorista_Id());
                    avaliacao.setCliente_Id(avaliacaoUpdate.getCliente_Id());
                    avaliacao.set_Descricao(avaliacaoUpdate.get_Descricao());
                    return avaliacaoRepository.save(avaliacao);
                })
                .orElse(null);
    }
    public void deleteRating(Long id) {
        avaliacaoRepository.deleteById(id);
    }
}