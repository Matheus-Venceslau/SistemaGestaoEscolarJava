package models;

public class Professor {
    private String nomeProfessor;
    private String diciplinaProfessor;
    private int idadeProfessor;

    public Professor(String nomeProfessor, String diciplinaProfessor, int idadeProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.diciplinaProfessor = diciplinaProfessor;
        this.idadeProfessor = idadeProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getDiciplinaProfessor() {
        return diciplinaProfessor;
    }

    public int getIdadeProfessor() {
        return idadeProfessor;
    }
    
    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor='" + nomeProfessor + '\'' +
                ", diciplinaProfessor='" + diciplinaProfessor + '\'' +
                ", idadeProfessor=" + idadeProfessor +
                '}';
    }

}
