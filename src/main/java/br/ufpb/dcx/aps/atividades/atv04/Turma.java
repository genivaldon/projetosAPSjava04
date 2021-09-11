package br.ufpb.dcx.aps.atividades.atv04;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(int codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public Turma() {
        this.codigo = 0;
    }

    public void addAluno(Aluno aluno) {
        disciplina.getCurso().getAlunoMatriculado(aluno.getMatricula());
        alunos.add(aluno);
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}
