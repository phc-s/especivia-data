package br.com.especivia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Motorista")
public class Motorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long motoristaId;

    @Setter
    @Getter
    private String nome;

    @Setter
    @Getter
    private String sobrenome;

    @Setter
    @Getter
    private String email;

    @Setter
    @Getter
    private String endereco;

    @Setter
    @Getter
    private int numero;

    @Setter
    @Getter
    private int cpf;

    @Setter
    @Getter
    private int senha;

    public long getId() {
        return motoristaId;
    }

    public void setId(long motoristaId) {
        this.motoristaId = motoristaId;
    }

}
