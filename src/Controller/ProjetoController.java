package Controller;

import model.Aluno;
import model.Projeto;
import service.ProjetoService;

import java.util.List;

public class ProjetoController {

    private ProjetoService projetoService;

    public ProjetoController() {
        this.projetoService = new ProjetoService();
    }

    public void adicionarProjeto(Projeto projeto) {
        projetoService.adicionarProjeto(projeto);
    }

    public List<Projeto> listarProjetos() {
        return projetoService.listarProjetos();
    }

    public Projeto buscarProjeto(String titulo) {
        return projetoService.buscarProjeto(titulo);
    }

    public void inscreverAluno(Projeto projeto, Aluno aluno) throws Exception {
        projetoService.inscreverAluno(projeto, aluno);
    }

    public void encerrarProjeto(Projeto projeto) {
        projetoService.encerrarProjeto(projeto);
    }
}