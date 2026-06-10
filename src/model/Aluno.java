package model;

public class Aluno extends Usuario {

    private String curso;
    private int historicoProjetos;

    public Aluno() {
    }

    public Aluno(String nome, String email, String senha,
                 String curso, int historicoProjetos) {

        super(nome, email, senha);
        this.curso = curso;
        this.historicoProjetos = historicoProjetos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getHistoricoProjetos() {
        return historicoProjetos;
    }

    public void setHistoricoProjetos(int historicoProjetos) {
        this.historicoProjetos = historicoProjetos;
    }
}