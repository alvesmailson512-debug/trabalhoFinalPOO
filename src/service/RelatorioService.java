package service;

import java.util.List;

import model.Projeto;

public class RelatorioService {

    public void gerarRelatorioProjetos(List<Projeto> projetos) {

        System.out.println("===== RELATÓRIO =====");

        for (Projeto projeto : projetos) {

            System.out.println("Título: " + projeto.getTitulo());
            System.out.println("Área: " + projeto.getAreaPesquisa());
            System.out.println("Status: " + projeto.getStatus());

            System.out.println("------------------");
        }
    }
}