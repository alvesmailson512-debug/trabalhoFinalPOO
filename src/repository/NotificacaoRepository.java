package repository;

import model.Notificacao;
import java.util.ArrayList;
import java.util.List;

public class NotificacaoRepository {

    private List<Notificacao> notificacoes = new ArrayList<>();

    public void salvar(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

    public List<Notificacao> listarTodas() {
        return notificacoes;
    }
}