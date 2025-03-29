package models;

public class Disciplina {
    private  String nomeDisciplina;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.nomeDisciplina = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nomeDisciplina + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", professor=" + professor +
                '}';
    }
}
