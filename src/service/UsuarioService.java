package service;

public class UsuarioService {

    public void cadastrarNovoProjeto(String titulo, String area, String professor, int vagas, String descricao) {
        System.out.println("Projeto " + titulo + " pré-registrado com sucesso.");
    }

    public boolean removerProjetoExistente(int idProjeto) {
        return true;
    }

    public void enviarNotificacaoSistema(String mensagem) {
        System.out.println("[NOTIFICAÇÃO]: " + mensagem);
    }
}