package br.com.especivia.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @Column(nullable = false, unique = true)
    private Motorista motorista_id;

    @ElementCollection
    @Column(nullable = false)
    private List<String> equipamentos;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private int portas;

    @Column(nullable = false)
    private int ano;

    @Column(nullable = false)
    private double quilometragem;

    public long get_Id() {
        return id;
    }

    public void set_Id(long id) {
        this.id = id;
    }

    public Motorista getMotorista_Id() {
        return motorista_id;
    }

    public void setMotorista_Id(Motorista motorista_id) {
        this.motorista_id = motorista_id;
    }

    public String get_Marca() {
        return marca;
    }

    public void set_Marca(String marca) {
        this.marca = marca;
    }

    public String get_Modelo() {
        return modelo;
    }

    public void set_Modelo(String modelo) {
        this.modelo = modelo;
    }

    public int get_Portas() {
        return portas;
    }

    public void set_Portas(int portas) {
        this.portas = portas;
    }

    public int get_Ano() {
        return ano;
    }

    public void set_Ano(int ano) {
        this.ano = ano;
    }

    public double get_Quilometragem() {
        return quilometragem;
    }

    public void set_Quilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public List<String> get_Equipamentos() {
        return equipamentos;
    }

    public void set_Equipamentos(List<String> equipamentos) {
        this.equipamentos = equipamentos;
    }



}
