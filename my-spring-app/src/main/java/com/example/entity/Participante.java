package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotNull(message = "Idade é obrigatória")
    @Min(value = 0, message = "Idade não pode ser negativa")
    private Integer idade;

    @NotBlank(message = "Gênero é obrigatório")
    private String genero;

    @NotBlank(message = "Raça/Cor é obrigatória")
    private String racaCor;

    @NotBlank(message = "Escolaridade é obrigatória")
    private String escolaridade;

    @NotBlank(message = "Estado civil é obrigatório")
    private String estadoCivil;

    @NotBlank(message = "Emprego é obrigatório")
    private String emprego;

    private String auxilios;

    @NotNull(message = "Número de dependentes é obrigatório")
    @Min(value = 0, message = "Número de dependentes não pode ser negativo")
    private Integer numeroDependentes;

    @NotBlank(message = "Religião é obrigatória")
    private String religiao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    public String getAuxilios() {
        return auxilios;
    }

    public void setAuxilios(String auxilios) {
        this.auxilios = auxilios;
    }

    public Integer getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(Integer numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }
}