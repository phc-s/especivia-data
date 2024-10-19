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
    public Avaliacao getRatingByID(Long avaliacaoId)
    {
        return avaliacaoRepository.findById(avaliacaoId).orElse(null);
    }
    public Avaliacao createRating(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public Avaliacao updateRating(Long id, Avaliacao avaliacaoUpdate) {
        return avaliacaoRepository.findById(id)
                .map(avaliacao -> {
                    avaliacao.setId(avaliacaoUpdate.getId());
                    avaliacao.setTags(avaliacaoUpdate.getTags());
                    avaliacao.setEstrelas(avaliacaoUpdate.getEstrelas());
                    avaliacao.setMotoristaId(avaliacaoUpdate.getMotoristaId());
                    avaliacao.setClienteId(avaliacaoUpdate.getClienteId());
                    avaliacao.setDescricao(avaliacaoUpdate.getDescricao());
                    return avaliacaoRepository.save(avaliacao);
                })
                .orElse(null);
    }
    public void deleteRating(Long id) {
        avaliacaoRepository.deleteById(id);
    }
}