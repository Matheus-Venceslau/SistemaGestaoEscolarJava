package models;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoLetivo;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma, int anoLetivo) {
        this.nomeTurma = nomeTurma;
        this.anoLetivo = anoLetivo;
        this.alunos = new ArrayList<>();
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nomeTurma='" + nomeTurma + '\'' +
                ", anoLetivo=" + anoLetivo +
                ", alunos=" + alunos +
                '}';
    }
}
