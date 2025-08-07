package barbearia.barbeariaapi.repository;

import barbearia.barbeariaapi.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
