package barbearia.barbearia_api.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataCadastro;

    @ManyToOne
    @JoinColumn(name = "plano_id")
    private PlanoMensal planoMensal;
    
}