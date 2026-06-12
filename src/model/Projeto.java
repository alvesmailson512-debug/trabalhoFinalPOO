package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private String titulo;
    private String descricao;
    private String areaPesquisa;
    private Professor orientador;
    private LocalDate dataInicio;
    private LocalDate prazo;
    private int vagas;
    private StatusProjeto status;

    private List<Aluno> participantes;

    public Projeto(String titulo,
                   String descricao,
                   String areaPesquisa,
                   Professor orientador,
                   LocalDate dataInicio,
                   LocalDate prazo,
                   int vagas) {

        this.titulo = titulo;
        this.descricao = descricao;
        this.areaPesquisa = areaPesquisa;
        this.orientador = orientador;
        this.dataInicio = dataInicio;
        this.prazo = prazo;
        this.vagas = vagas;

        this.status = StatusProjeto.ABERTO;
        this.participantes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public int getVagas() {
        return vagas;
    }

    public StatusProjeto getStatus() {
        return status;
    }

    public List<Aluno> getParticipantes() {
        return participantes;
    }

    public void setStatus(StatusProjeto status) {
        this.status = status;
    }

    public void adicionarParticipante(Aluno aluno) {
        participantes.add(aluno);
    }

    public void removerParticipante(Aluno aluno) {
        participantes.remove(aluno);
    }

    public int vagasDisponiveis() {
        return vagas - participantes.size();
    }
}