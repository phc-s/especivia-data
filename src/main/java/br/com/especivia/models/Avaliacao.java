package br.com.especivia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ElementCollection;
import java.util.List;

@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long avaliacao_id;

    @OneToOne
    private Motorista motorista_id;

    @OneToOne
    private Cliente cliente_id;

    @ElementCollection
    private List<String> tags;

    private double estrelas;
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
