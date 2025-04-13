package com.example.service;

import com.example.entity.ConsumoAlimentar;
import com.example.repository.ConsumoAlimentarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumoAlimentarService {

    @Autowired
    private ConsumoAlimentarRepository consumoAlimentarRepository;

    public ConsumoAlimentar saveConsumoAlimentar(ConsumoAlimentar consumoAlimentar) {
        return consumoAlimentarRepository.save(consumoAlimentar);
    }

    public Optional<ConsumoAlimentar> getConsumoAlimentarById(Long id) {
        return consumoAlimentarRepository.findById(id);
    }

    public List<ConsumoAlimentar> getConsumoByParticipante(Integer idParticipante) {
        return consumoAlimentarRepository.findByIdParticipante(idParticipante);
    }

    public void deleteConsumoAlimentar(Long id) {
        consumoAlimentarRepository.deleteById(id);
    }
}
