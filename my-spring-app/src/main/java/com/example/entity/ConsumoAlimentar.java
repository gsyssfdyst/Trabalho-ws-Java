package com.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class ConsumoAlimentar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "IdParticipante é obrigatório")
    private Integer idParticipante;

    @NotNull(message = "Refeição é obrigatória")
    private String refeicao;

    @NotNull(message = "UsaDispositivoEletronico é obrigatório")
    private Boolean usaDispositivoEletronico;

    @NotNull(message = "ConsumiuFeijao é obrigatório")
    private Boolean consumiuFeijao;

    @NotNull(message = "ConsumiuFrutasFrescas é obrigatório")
    private Boolean consumiuFrutasFrescas;

    @NotNull(message = "ConsumiuVerdurasLegumes é obrigatório")
    private Boolean consumiuVerdurasLegumes;

    @NotNull(message = "ConsumiuHamburguerEmbutidos é obrigatório")
    private Boolean consumiuHamburguerEmbutidos;

    @NotNull(message = "ConsumiuBebidasAdocadas é obrigatório")
    private Boolean consumiuBebidasAdocadas;

    @NotNull(message = "ConsumiuMacarraoInstantaneo é obrigatório")
    private Boolean consumiuMacarraoInstantaneo;

    @NotNull(message = "ConsumiuBiscoitosDoces é obrigatório")
    private Boolean consumiuBiscoitosDoces;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(Integer idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }

    public Boolean getUsaDispositivoEletronico() {
        return usaDispositivoEletronico;
    }

    public void setUsaDispositivoEletronico(Boolean usaDispositivoEletronico) {
        this.usaDispositivoEletronico = usaDispositivoEletronico;
    }

    public Boolean getConsumiuFeijao() {
        return consumiuFeijao;
    }

    public void setConsumiuFeijao(Boolean consumiuFeijao) {
        this.consumiuFeijao = consumiuFeijao;
    }

    public Boolean getConsumiuFrutasFrescas() {
        return consumiuFrutasFrescas;
    }

    public void setConsumiuFrutasFrescas(Boolean consumiuFrutasFrescas) {
        this.consumiuFrutasFrescas = consumiuFrutasFrescas;
    }

    public Boolean getConsumiuVerdurasLegumes() {
        return consumiuVerdurasLegumes;
    }

    public void setConsumiuVerdurasLegumes(Boolean consumiuVerdurasLegumes) {
        this.consumiuVerdurasLegumes = consumiuVerdurasLegumes;
    }

    public Boolean getConsumiuHamburguerEmbutidos() {
        return consumiuHamburguerEmbutidos;
    }

    public void setConsumiuHamburguerEmbutidos(Boolean consumiuHamburguerEmbutidos) {
        this.consumiuHamburguerEmbutidos = consumiuHamburguerEmbutidos;
    }

    public Boolean getConsumiuBebidasAdocadas() {
        return consumiuBebidasAdocadas;
    }

    public void setConsumiuBebidasAdocadas(Boolean consumiuBebidasAdocadas) {
        this.consumiuBebidasAdocadas = consumiuBebidasAdocadas;
    }

    public Boolean getConsumiuMacarraoInstantaneo() {
        return consumiuMacarraoInstantaneo;
    }

    public void setConsumiuMacarraoInstantaneo(Boolean consumiuMacarraoInstantaneo) {
        this.consumiuMacarraoInstantaneo = consumiuMacarraoInstantaneo;
    }

    public Boolean getConsumiuBiscoitosDoces() {
        return consumiuBiscoitosDoces;
    }

    public void setConsumiuBiscoitosDoces(Boolean consumiuBiscoitosDoces) {
        this.consumiuBiscoitosDoces = consumiuBiscoitosDoces;
    }
}