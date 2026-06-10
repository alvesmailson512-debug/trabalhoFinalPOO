package model;

public class Disciplina {

    private String nome;
    private String areaPesquisa;

    public Disciplina() {
    }

    public Disciplina(String nome, String areaPesquisa) {
        this.nome = nome;
        this.areaPesquisa = areaPesquisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }
}