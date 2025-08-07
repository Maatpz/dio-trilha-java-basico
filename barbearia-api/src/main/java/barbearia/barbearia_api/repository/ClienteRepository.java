package barbearia.barbeariaapi.repository;

import barbearia.barbeariaapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

