package com.example.controller;

import com.example.entity.Participante;
import com.example.service.ParticipanteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    @GetMapping
    public List<Participante> getAllParticipantes() {
        return participanteService.getAllParticipantes();
    }

    @PostMapping
    public ResponseEntity<Participante> createParticipante(@Valid @RequestBody Participante participante) {
        Participante savedParticipante = participanteService.saveParticipante(participante);
        return new ResponseEntity<>(savedParticipante, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Participante> getParticipanteById(@PathVariable Long id) {
        return participanteService.getParticipanteById(id)
                .map(participante -> new ResponseEntity<>(participante, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Participante> updateParticipante(@PathVariable Long id, @Valid @RequestBody Participante participante) {
        return participanteService.getParticipanteById(id)
                .map(existingParticipante -> {
                    participante.setId(id);
                    Participante updatedParticipante = participanteService.saveParticipante(participante);
                    return new ResponseEntity<>(updatedParticipante, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParticipante(@PathVariable Long id) {
        return participanteService.getParticipanteById(id)
                .map(participante -> {
                    participanteService.deleteParticipante(id);
                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
