package com.example.service;

import com.example.entity.EbiaAvaliacao;
import com.example.entity.Participante;
import com.example.repository.EbiaRepository;
import com.example.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EbiaService {

    @Autowired
    private EbiaRepository ebiaRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    public EbiaAvaliacao saveEbiaAvaliacao(Long participanteId, EbiaAvaliacao ebiaAvaliacao) {
        Participante participante = participanteRepository.findById(participanteId)
                .orElseThrow(() -> new IllegalArgumentException("Participante não encontrado"));

        ebiaAvaliacao.setParticipante(participante);
        return ebiaRepository.save(ebiaAvaliacao);
    }

    public Optional<EbiaAvaliacao> getEbiaAvaliacaoByParticipanteId(Long participanteId) {
        return ebiaRepository.findByParticipanteId(participanteId);
    }
}
