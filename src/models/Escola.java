package models;

import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;
    private ArrayList<Disciplina> disciplinas;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void listarAlunos(){
        System.out.println("Lista de Alunos: ");
        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    public void listarProfessor(){
        System.out.println("Lista de Professores: ");
        for (Professor professor : professores){
            System.out.println(professor);
        }
    }

    public void listarTurmas(){
        System.out.println("Lista das Turmas: ");
        for (Turma turma : turmas){
            System.out.println(turma);
        }
    }

    public void listarDisciplinas(){
        System.out.println("Lista de disciplinas: ");
        for (Disciplina disciplina : disciplinas){
            System.out.println(disciplina);
        }
    }
}
