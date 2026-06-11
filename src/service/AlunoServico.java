package service;

public class AlunoServico {

    public void listarProjetosDisponiveis() {
        System.out.println("Lista de projetos ativos obtida com sucesso.");
    }

    public boolean inscreverEmProjeto(String matriculaAluno, int idProjeto) {
        if (idProjeto > 0) {
            return true;
        }
        return false;
    }

    public boolean cancelarInscricao(String matriculaAluno, int idProjeto) {
        return true;
    }
}