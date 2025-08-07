package barbearia.barbeariaapi.service;

import barbearia.barbeariaapi.model.PlanoMensal;
import barbearia.barbeariaapi.repository.PlanoMensalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoMensalService {

    @Autowired
    private PlanoMensalRepository planoMensalRepository;

    public List<PlanoMensal> listarTodos() {
        return planoMensalRepository.findAll();
    }

    public Optional<PlanoMensal> buscarPorId(Long id) {
        return planoMensalRepository.findById(id);
    }

    public PlanoMensal salvar(PlanoMensal plano) {
        return planoMensalRepository.save(plano);
    }

    public void deletar(Long id) {
        planoMensalRepository.deleteById(id);
    }
}
