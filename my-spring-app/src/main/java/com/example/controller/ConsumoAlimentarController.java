package com.example.controller;

import com.example.entity.ConsumoAlimentar;
import com.example.service.ConsumoAlimentarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumo-alimentar")
public class ConsumoAlimentarController {

    @Autowired
    private ConsumoAlimentarService consumoAlimentarService;

    @PostMapping
    public ResponseEntity<ConsumoAlimentar> createConsumoAlimentar(@Valid @RequestBody ConsumoAlimentar consumoAlimentar) {
        ConsumoAlimentar savedConsumo = consumoAlimentarService.saveConsumoAlimentar(consumoAlimentar);
        return new ResponseEntity<>(savedConsumo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsumoAlimentar> getConsumoAlimentarById(@PathVariable Long id) {
        return consumoAlimentarService.getConsumoAlimentarById(id)
                .map(consumo -> new ResponseEntity<>(consumo, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/participante/{idParticipante}")
    public ResponseEntity<List<ConsumoAlimentar>> getConsumoByParticipante(@PathVariable Long idParticipante) {
        List<ConsumoAlimentar> consumos = consumoAlimentarService.getConsumoByParticipante(idParticipante);
        return new ResponseEntity<>(consumos, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConsumoAlimentar> updateConsumoAlimentar(@PathVariable Long id, @Valid @RequestBody ConsumoAlimentar consumoAlimentar) {
        return consumoAlimentarService.getConsumoAlimentarById(id)
                .map(existingConsumo -> {
                    consumoAlimentar.setId(id);
                    ConsumoAlimentar updatedConsumo = consumoAlimentarService.saveConsumoAlimentar(consumoAlimentar);
                    return new ResponseEntity<>(updatedConsumo, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConsumoAlimentar(@PathVariable Long id) {
        return consumoAlimentarService.getConsumoAlimentarById(id)
                .map(consumo -> {
                    consumoAlimentarService.deleteConsumoAlimentar(id);
                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
