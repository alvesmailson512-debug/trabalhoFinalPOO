package Application;

import java.time.LocalDate;
import java.util.Scanner;

import Controller.NotificacaoController;
import Controller.ProjetoController;
import Controller.UsuarioController;

import model.Aluno;
import model.Professor;
import model.Projeto;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UsuarioController usuarioController = new UsuarioController();
        ProjetoController projetoController = new ProjetoController();
        NotificacaoController notificacaoController = new NotificacaoController();

        int opcao;

        do {

            System.out.println("\n=================================");
            System.out.println(" SISTEMA DE PROJETOS DE PESQUISA ");
            System.out.println("=================================");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Criar Projeto");
            System.out.println("3 - Listar Usuários");
            System.out.println("4 - Listar Projetos");
            System.out.println("5 - Enviar Notificação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do aluno: ");
                    String nomeAluno = scanner.nextLine();

                    System.out.print("Email: ");
                    String emailAluno = scanner.nextLine();

                    System.out.print("Senha: ");
                    String senhaAluno = scanner.nextLine();

                    Aluno aluno = new Aluno(
                            "A" + System.currentTimeMillis(),
                            nomeAluno,
                            emailAluno,
                            senhaAluno
                    );

                    usuarioController.cadastrarUsuario(aluno);

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:

                    System.out.print("Título do projeto: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Descrição do projeto: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Área de pesquisa: ");
                    String area = scanner.nextLine();

                    Professor professor = new Professor(
                            "P1",
                            "Professor Responsável",
                            "prof@email.com",
                            "123"
                    );

                    Projeto projeto = new Projeto(
                            titulo,
                            descricao,
                            area,
                            professor,
                            LocalDate.now(),
                            LocalDate.now().plusMonths(6),
                            10
                    );

                    projetoController.adicionarProjeto(projeto);

                    System.out.println("Projeto criado com sucesso!");
                    break;

                case 3:

                    System.out.println("\n=== USUÁRIOS CADASTRADOS ===");

                    usuarioController.listarUsuarios().forEach(usuario ->
                            System.out.println(usuario.getNome()));

                    break;

                case 4:

                    System.out.println("\n=== PROJETOS CADASTRADOS ===");

                    projetoController.listarProjetos().forEach(p -> {
                        System.out.println("Título: " + p.getTitulo());
                        System.out.println("Área: " + p.getAreaPesquisa());
                        System.out.println("Status: " + p.getStatus());
                        System.out.println("----------------------");
                    });

                    break;

                case 5:

                    System.out.print("Digite a mensagem: ");
                    String mensagem = scanner.nextLine();

                    notificacaoController.enviarNotificacao(mensagem);

                    System.out.println("Notificação enviada!");

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}