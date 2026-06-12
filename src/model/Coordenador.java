package model;

public class Coordenador extends Usuario {

    private String setor;

    public Coordenador() {
    }

    public Coordenador(String nome, String email, String senha, String setor) {
        super(nome, email, senha);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}