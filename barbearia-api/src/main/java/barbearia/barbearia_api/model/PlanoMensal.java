package barbearia.barbeariaapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PlanoMensal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;

    private Integer quantidadeMaximaServicosMensais;

    private boolean servicosIlimitados;
}
