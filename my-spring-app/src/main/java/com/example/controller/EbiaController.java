package com.example.controller;

import com.example.entity.EbiaAvaliacao;
import com.example.service.EbiaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ebia")
public class EbiaController {

    @Autowired
    private EbiaService ebiaService;

    @PostMapping("/participantes/{id}")
    public ResponseEntity<EbiaAvaliacao> createEbiaAvaliacao(@PathVariable Long id, @Valid @RequestBody EbiaAvaliacao ebiaAvaliacao) {
        EbiaAvaliacao savedAvaliacao = ebiaService.saveEbiaAvaliacao(id, ebiaAvaliacao);
        return new ResponseEntity<>(savedAvaliacao, HttpStatus.CREATED);
    }

    @GetMapping("/participantes/{id}")
    public ResponseEntity<EbiaAvaliacao> getEbiaAvaliacao(@PathVariable Long id) {
        return ebiaService.getEbiaAvaliacaoByParticipanteId(id)
                .map(avaliacao -> new ResponseEntity<>(avaliacao, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
