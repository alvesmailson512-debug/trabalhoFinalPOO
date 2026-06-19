package Controller;

import service.NotificacaoService;

public class NotificacaoController {

    private NotificacaoService notificacaoService;

    public NotificacaoController() {
        this.notificacaoService = NotificacaoService.getInstancia();
    }

    public void enviarNotificacao(String mensagem) {
        notificacaoService.enviarNotificacao(mensagem);
    }
}