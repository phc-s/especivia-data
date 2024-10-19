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
@Table(name = "Carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @OneToOne
    private Motorista motoristaId;

    @Setter
    @Getter
    private List<String> equipamentos;

    @Setter
    @Getter
    private String marca;

    @Setter
    @Getter
    private String modelo;

    @Setter
    @Getter
    private int portas;

    @Setter
    @Getter
    private int ano;

    @Setter
    @Getter
    private double quilometragem;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
