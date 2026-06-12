package model;

import java.time.LocalDateTime;

public class Notificacao {

    private String mensagem;
    private LocalDateTime dataHora;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
        this.dataHora = LocalDateTime.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}