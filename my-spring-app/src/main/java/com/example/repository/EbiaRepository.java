package com.example.repository;

import com.example.entity.EbiaAvaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EbiaRepository extends JpaRepository<EbiaAvaliacao, Long> {
    Optional<EbiaAvaliacao> findByParticipanteId(Long participanteId);
}
