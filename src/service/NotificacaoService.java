package service;

import java.util.List;

import model.Notificacao;
import repository.NotificacaoRepository;

public class NotificacaoService {

    private static NotificacaoService instancia;

    private NotificacaoRepository repository;

    private NotificacaoService() {
        repository = new NotificacaoRepository();
    }

    public static NotificacaoService getInstancia() {

        if (instancia == null) {
            instancia = new NotificacaoService();
        }

        return instancia;
    }

    public void enviarNotificacao(String mensagem) {

        Notificacao notificacao = new Notificacao(mensagem);

        repository.salvar(notificacao);

        System.out.println();
        System.out.println("===== NOTIFICAÇÃO =====");
        System.out.println(mensagem);
        System.out.println("=======================");
        System.out.println();
    }

    public List<Notificacao> listarNotificacoes() {
        return repository.listarTodas();
    }
}