package service;

import java.util.ArrayList;
import java.util.List;

import exception.ProjetoEncerradoException;
import exception.ProjetoSemVagasException;

import model.Aluno;
import model.Projeto;
import model.StatusProjeto;

public class ProjetoService {

    private List<Projeto> projetos;

    public ProjetoService() {
        projetos = new ArrayList<>();
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public List<Projeto> listarProjetos() {
        return projetos;
    }

    public void removerProjeto(Projeto projeto) {
        projetos.remove(projeto);
    }

    public Projeto buscarProjeto(String titulo) {

        for (Projeto projeto : projetos) {

            if (projeto.getTitulo().equalsIgnoreCase(titulo)) {
                return projeto;
            }

        }

        return null;
    }

    public void inscreverAluno(Projeto projeto, Aluno aluno)
            throws ProjetoEncerradoException,
                   ProjetoSemVagasException {

        if (projeto.getStatus() == StatusProjeto.ENCERRADO) {
            throw new ProjetoEncerradoException(
                    "Projeto encerrado."
            );
        }

        if (projeto.vagasDisponiveis() <= 0) {
            throw new ProjetoSemVagasException(
                    "Não existem vagas disponíveis."
            );
        }

        projeto.adicionarParticipante(aluno);
        aluno.participarProjeto(projeto);
    }

    public void encerrarProjeto(Projeto projeto) {
        projeto.setStatus(StatusProjeto.ENCERRADO);
    }
}