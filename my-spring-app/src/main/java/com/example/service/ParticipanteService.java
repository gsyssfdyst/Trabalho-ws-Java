package com.example.service;

import com.example.entity.Participante;
import com.example.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public Participante saveParticipante(Participante participante) {
        return participanteRepository.save(participante);
    }

    public Optional<Participante> getParticipanteById(Long id) {
        return participanteRepository.findById(id);
    }

    public List<Participante> getAllParticipantes() {
        return participanteRepository.findAll();
    }

    public void deleteParticipante(Long id) {
        participanteRepository.deleteById(id);
    }
}
