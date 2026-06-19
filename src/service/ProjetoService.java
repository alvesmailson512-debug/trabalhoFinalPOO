package service;

import java.util.List;

import exception.ProjetoEncerradoException;
import exception.ProjetoSemVagasException;

import model.Aluno;
import model.Projeto;
import model.StatusProjeto;

import repository.ProjetoRepository;

public class ProjetoService {

    private ProjetoRepository repository;

    public ProjetoService() {
        repository = new ProjetoRepository();
    }

    public void adicionarProjeto(Projeto projeto) {
        repository.salvar(projeto);
    }

    public List<Projeto> listarProjetos() {
        return repository.listarTodos();
    }

    public void removerProjeto(Projeto projeto) {
        repository.listarTodos().remove(projeto);
    }

    public Projeto buscarProjeto(String titulo) {

        for (Projeto projeto : repository.listarTodos()) {

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
                    "Projeto encerrado.");
        }

        if (projeto.vagasDisponiveis() <= 0) {

            throw new ProjetoSemVagasException(
                    "Não existem vagas disponíveis.");
        }

        projeto.adicionarParticipante(aluno);
        aluno.participarProjeto(projeto);
    }

    public void encerrarProjeto(Projeto projeto) {
        projeto.setStatus(StatusProjeto.ENCERRADO);
    }
}