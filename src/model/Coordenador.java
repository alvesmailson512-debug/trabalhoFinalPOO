package model;

import interfaces.Autenticavel;

public class Coordenador extends Usuario
        implements Autenticavel {

    public Coordenador(String id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    @Override
    public void exibirMenu() {
        System.out.println("Menu do Coordenador");
    }

    @Override
    public boolean autenticar(String email, String senha) {
        return getEmail().equals(email)
                && getSenha().equals(senha);
    }
}