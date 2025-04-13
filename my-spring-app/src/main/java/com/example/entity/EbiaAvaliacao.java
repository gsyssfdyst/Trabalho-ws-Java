package com.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class EbiaAvaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "participante_id", nullable = false)
    private Participante participante;

    @NotNull
    private Boolean resposta1;

    @NotNull
    private Boolean resposta2;

    @NotNull
    private Boolean resposta3;

    @NotNull
    private Boolean resposta4;

    @NotNull
    private Boolean resposta5;

    @NotNull
    private Boolean resposta6;

    @NotNull
    private Boolean resposta7;

    @NotNull
    private Boolean resposta8;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Boolean getResposta1() {
        return resposta1;
    }

    public void setResposta1(Boolean resposta1) {
        this.resposta1 = resposta1;
    }

    public Boolean getResposta2() {
        return resposta2;
    }

    public void setResposta2(Boolean resposta2) {
        this.resposta2 = resposta2;
    }

    public Boolean getResposta3() {
        return resposta3;
    }

    public void setResposta3(Boolean resposta3) {
        this.resposta3 = resposta3;
    }

    public Boolean getResposta4() {
        return resposta4;
    }

    public void setResposta4(Boolean resposta4) {
        this.resposta4 = resposta4;
    }

    public Boolean getResposta5() {
        return resposta5;
    }

    public void setResposta5(Boolean resposta5) {
        this.resposta5 = resposta5;
    }

    public Boolean getResposta6() {
        return resposta6;
    }

    public void setResposta6(Boolean resposta6) {
        this.resposta6 = resposta6;
    }

    public Boolean getResposta7() {
        return resposta7;
    }

    public void setResposta7(Boolean resposta7) {
        this.resposta7 = resposta7;
    }

    public Boolean getResposta8() {
        return resposta8;
    }

    public void setResposta8(Boolean resposta8) {
        this.resposta8 = resposta8;
    }
}