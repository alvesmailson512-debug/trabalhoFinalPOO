package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.Autenticavel;
import interfaces.Notificavel;

public class Professor extends Usuario
        implements Autenticavel, Notificavel {

    private List<Projeto> projetosOrientados;

    public Professor(String id, String nome, String email, String senha) {

        super(id, nome, email, senha);

        this.projetosOrientados = new ArrayList<>();
    }

    @Override
    public void exibirMenu() {
        System.out.println("Menu do Professor");
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

    public void adicionarProjeto(Projeto projeto) {
        projetosOrientados.add(projeto);
    }

    public List<Projeto> getProjetosOrientados() {
        return projetosOrientados;
    }
}