package repository;

import model.Projeto;
import java.util.ArrayList;
import java.util.List;

public class ProjetoRepository {

    private List<Projeto> projetos = new ArrayList<>();

    public void salvar(Projeto projeto) {
        projetos.add(projeto);
    }

    public List<Projeto> listarTodos() {
        return projetos;
    }
}