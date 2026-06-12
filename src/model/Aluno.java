package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.Autenticavel;
import interfaces.Notificavel;

public class Aluno extends Usuario
        implements Autenticavel, Notificavel {

    private List<Projeto> projetosParticipando;
    private List<Projeto> historicoProjetos;
    private List<Relatorio> relatorios;

    public Aluno(String id, String nome, String email, String senha) {

        super(id, nome, email, senha);

        this.projetosParticipando = new ArrayList<>();
        this.historicoProjetos = new ArrayList<>();
        this.relatorios = new ArrayList<>();
    }

    @Override
    public void exibirMenu() {
        System.out.println("Menu do Aluno");
    }

    @Override
    public boolean autenticar(String email, String senha) {
        return getEmail().equals(email)
                && getSenha().equals(senha);
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }

    public void participarProjeto(Projeto projeto) {
        projetosParticipando.add(projeto);
    }

    public void adicionarHistorico(Projeto projeto) {
        historicoProjetos.add(projeto);
    }

    public void enviarRelatorio(Relatorio relatorio) {
        relatorios.add(relatorio);
    }

    public List<Projeto> getProjetosParticipando() {
        return projetosParticipando;
    }

    public List<Projeto> getHistoricoProjetos() {
        return historicoProjetos;
    }

    public List<Relatorio> getRelatorios() {
        return relatorios;
    }
}