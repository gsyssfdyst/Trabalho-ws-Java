package com.example.repository;

import com.example.entity.ConsumoAlimentar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsumoAlimentarRepository extends JpaRepository<ConsumoAlimentar, Long> {
    List<ConsumoAlimentar> findByIdParticipante(Long idParticipante);
}
