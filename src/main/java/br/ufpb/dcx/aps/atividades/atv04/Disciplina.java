package br.ufpb.dcx.aps.atividades.atv04;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Disciplina {

    private Curso curso;
    private String codigo;
    private String nome;

    private List<Turma> turmas = new LinkedList<Turma>();

    public Disciplina(Curso curso, String codigo, String nome) {
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Turma criarTurma() {
        Turma alfabetizacao = new Turma(gerarCodigoTurma(), this);
        turmas.add(alfabetizacao);
        return alfabetizacao;

    }

    public Disciplina() {
        this.codigo = "";
        this.nome = "";
    }

    public String getNome() {
        return this.nome;
    }

    public Collection<Turma> getTurmas() {
        return turmas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public Turma getTurma(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("código inválido:" + numero);
        }
        if (numero == 0) {
            throw new IllegalArgumentException("código inválido:" + numero);
        }

        for (Turma t : turmas) {
            if (t.getCodigo() == numero)
                return t;
        }

        throw new RuntimeException("Não existe turma com código:" + numero);
    }

    private int gerarCodigoTurma() {
        int aux = 1;
        for (Turma t : turmas) {
            aux = t.getCodigo();
            aux++;
        }
        return aux;
    }
}
