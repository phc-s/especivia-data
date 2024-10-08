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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@table(name = "Motorista")
public class Motorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long motorista_id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private int numero;

    @Column(nullable = false)
    private int cpf;

    @Column(nullable = false)
    private int senha;

    public long getMotorista_Id() {
        return motorista_id;
    }

    public void setMotorista_Id(long motorista_id) {
        this.motorista_id = motorista_id;
    }

    public String get_Nome() {
        return nome;
    }

    public void set_Nome(String nome) {
        this.nome = nome;
    }

    public String get_Sobrenome() {
        return sobrenome;
    }

    public void set_Sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String get_Email() {
        return email;
    }

    public void set_Email(String email) {
        this.email = email;
    }

    public String get_Endereco() {
        return endereco;
    }

    public void set_Endereco(String endereco) {
        this.endereco = endereco;
    }

    public int get_Numero() {
        return numero;
    }

    public void set_Numero(int numero) {
        this.numero = numero;
    }

    public int get_cpf() {
        return cpf;
    }

    public void set_cpf(int cpf) {
        this.cpf = cpf;
    }

    public int get_Senha() {
        return senha;
    }

    public void set_Senha(int senha) {
        this.senha = senha;
    }
}
