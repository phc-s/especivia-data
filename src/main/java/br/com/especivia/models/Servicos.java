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
@Table(name = "Serviços")
public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long servicosId;

    @Getter
    @Setter
    private Cliente clienteId;

    @Getter
    @Setter
    private Motorista motoristaId;

    public long getId() {
        return servicosId;
    }

    public void setId(long servicosId) {
        this.servicosId = servicosId;
    }
}
