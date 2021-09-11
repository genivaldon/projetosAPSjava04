package br.ufpb.dcx.aps.atividades.atv04;

public class Aluno {

    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno() {
        this.matricula = "";
        this.nome = "";
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object aluno) {
        if (this.matricula == ((Aluno) aluno).getMatricula()) {
            return true;
        }

        return false;
    }

}
