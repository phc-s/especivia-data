package br.com.especivia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

@Entity
public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long servicos_id;

    @OneToMany
    private Cliente cliente_id;

    @OneToMany
    private Motorista motorista_id;

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

    public Long getServicos_Id() {
        return servicos_id;
    }

    public void setServicos_Id(long servicos_id) {
        this.servicos_id = servicos_id;
    }

}
