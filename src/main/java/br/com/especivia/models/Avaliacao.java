package br.com.especivia.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Avaliação")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long avaliacaoId;

    @Getter
    @Setter
    @OneToOne
    private Motorista motoristaId;

    @Setter
    @Getter
    @OneToOne
    private Cliente clienteId;

    @Setter
    @Getter
    private List<String> tags;

    @Setter
    @Getter
    private double estrelas;

    @Setter
    @Getter
    private String descricao;

    public Long getId() {
        return avaliacaoId;
    }

    public void setId(long avaliacaoId) {
        this.avaliacaoId = avaliacaoId;
    }

}
