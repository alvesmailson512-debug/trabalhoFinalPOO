package model;

import java.time.LocalDate;

public class Relatorio {

    private String descricao;
    private LocalDate dataEnvio;
    private StatusRelatorio status;

    private Aluno autor;
    private Projeto projeto;

    public Relatorio(String descricao,
                     Aluno autor,
                     Projeto projeto) {

        this.descricao = descricao;
        this.autor = autor;
        this.projeto = projeto;

        this.dataEnvio = LocalDate.now();
        this.status = StatusRelatorio.PENDENTE;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }

    public StatusRelatorio getStatus() {
        return status;
    }

    public Aluno getAutor() {
        return autor;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void aprovar() {
        this.status = StatusRelatorio.APROVADO;
    }

    public void reprovar() {
        this.status = StatusRelatorio.REPROVADO;
    }
}