package barbearia.barbeariaapi.controller;

import barbearia.barbeariaapi.model.PlanoMensal;
import barbearia.barbeariaapi.service.PlanoMensalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanoMensalController {

    @Autowired
    private PlanoMensalService planoMensalService;

    @GetMapping
    public ResponseEntity<List<PlanoMensal>> listarTodos() {
        List<PlanoMensal> planos = planoMensalService.listarTodos();
        return ResponseEntity.ok(planos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanoMensal> buscarPorId(@PathVariable Long id) {
        return planoMensalService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PlanoMensal> criar(@RequestBody PlanoMensal plano) {
        PlanoMensal novo = planoMensalService.salvar(plano);
        return ResponseEntity.ok(novo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlanoMensal> atualizar(@PathVariable Long id, @RequestBody PlanoMensal plano) {
        return planoMensalService.buscarPorId(id).map(p -> {
            plano.setId(id);
            PlanoMensal atualizado = planoMensalService.salvar(plano);
            return ResponseEntity.ok(atualizado);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return planoMensalService.buscarPorId(id).map(p -> {
            planoMensalService.deletar(id);
            return ResponseEntity.noContent().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
