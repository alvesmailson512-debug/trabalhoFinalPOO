package model;

public class Turma {

    private String codigo;
    private int quantidadeAlunos;

    public Turma() {
    }

    public Turma(String codigo, int quantidadeAlunos) {
        this.codigo = codigo;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
}