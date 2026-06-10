package model;

public class Coordenador extends Usuario {

    private String departamento;

    public Coordenador() {
    }

    public Coordenador(String nome, String email, String senha,
                       String departamento) {

        super(nome, email, senha);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}