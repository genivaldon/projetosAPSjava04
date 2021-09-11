package br.ufpb.dcx.aps.atividades.atv04;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Curso {
    
    private String nome;
    private Map<String, Aluno> alunos = new HashMap<String, Aluno>();
    private Map<String, Disciplina> disciplinas = new HashMap<String, Disciplina>();
    

    public Curso (){
        this.nome = "";
    }

    public Curso (String nome) {
        this.nome = nome;
    }

    public void matricular(Aluno aluno) {
        if (aluno == null){
            throw new IllegalArgumentException ("aluno inválido:null");
        }
        if (this.alunos.containsKey(aluno.getMatricula())){
            throw new RuntimeException ("aluno já matriculado:"+aluno.getMatricula());
        } 
        
        Aluno genivaldoBoy = new Aluno(aluno.getMatricula(), aluno.getNome());
        alunos.put(aluno.getMatricula(), genivaldoBoy);
     }
      

    public Disciplina criarDisciplina(String codigo, String nome){
        int codigoInt = Integer.parseInt(codigo); 
        if (codigoInt < 0){
            throw new IllegalArgumentException ("Código inválido. Tente um código maior que 0");
        }
        Disciplina disc = new Disciplina (this, codigo, nome);
        disciplinas.put(codigo, disc);
        return disc;
    }

    
    public Disciplina getDisciplina(String codigo){
        if (disciplinas.containsKey(codigo)){
            return disciplinas.get(codigo);
        } else {
            throw new RuntimeException("Não existe disciplina com código:"+codigo);
        }

    }
    public Aluno getAlunoMatriculado(String matricula){
        if (alunos.containsKey(matricula)){
            return alunos.get(matricula);
        }  throw new RuntimeException("Aluno não está matriculado no curso:"+getNome()); 
    
    }

public boolean alunoMatriculado(String matricula){
        if (alunos.containsKey(matricula)){
            return true;
        } 
        return false;
    }

    public Collection<Aluno> getAlunosMatriculados(){
        return alunos.values();
      
    }


    public String getNome() {
        return this.nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
}
