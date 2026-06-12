package service;

public class NotificacaoService {

    private static NotificacaoService instancia;

    private NotificacaoService() {
    }

    public static NotificacaoService getInstancia() {

        if (instancia == null) {
            instancia = new NotificacaoService();
        }

        return instancia;
    }

    public void enviarNotificacao(String mensagem) {

        System.out.println();
        System.out.println("===== NOTIFICAÇÃO =====");
        System.out.println(mensagem);
        System.out.println("=======================");
        System.out.println();
    }
}