package br.com.especivia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.NoArgsConstructor;
import jakarta.persistence.AllArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ElementCollection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@table(name = "Avaliação")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long avaliacao_id;

    @OneToOne
    @Column(nullable = false, unique = true)
    private Motorista motorista_id;

    @OneToOne
    @Column(nullable = false, unique = true)
    private Cliente cliente_id;

    @ElementCollection
    @Column(nullable = true)
    private List<String> tags;

    @Column(nullable = false)
    private double estrelas;

    @Column(nullable = false)
    private String descricao;

    public long get_Avaliacao() {
        return avaliacao_id;
    }

    public void set_Avaliacao(long avaliacao_id) {
        this.avaliacao_id = avaliacao_id;
    }

    public Motorista getMotorista_Id() {
        return motorista_id;
    }

    public void setMotorista_Id(Motorista motorista_id) {
        this.motorista_id = motorista_id;
    }

    public Cliente getCliente_Id() {
        return cliente_id;
    }

    public void setCliente_Id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public List<String> get_Tags() {
        return tags;
    }

    public void set_Tags(List<String> tags) {
        this.tags = tags;
    }

    public double get_Estrelas() {
        return estrelas;
    }

    public void set_Estrelas(double estrelas) {
        this.estrelas = estrelas;
    }

    public String get_Descricao() {
        return descricao;
    }

    public void set_Descricao(String descricao) {
        this.descricao = descricao;
    }



}
