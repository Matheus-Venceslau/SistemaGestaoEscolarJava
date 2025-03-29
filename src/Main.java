import models.*;

import java.util.Timer;

public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola("Escola Senai");

        Aluno aluno1 = new Aluno("Carlos Silva", 15, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");
        Aluno aluno3 = new Aluno("Matheus Venceslau", 18, "A523");
        Aluno aluno4 = new Aluno("Pedro de Paula", 18, "F123");

        Professor professor1 = new Professor("João Pereira", "Matemática", 50);
        Professor professor2 = new Professor("Ana Costa", "Engenharia de Software", 60);
        Professor professor3 = new Professor("Célia Eterna", "Lógica de Programação", 500);
        Professor professor4 = new Professor("Lucimara", "Banco de dados", 65);

        Turma turma1 = new Turma("1-A", 2025);
        Turma turma2 = new Turma("1-A", 2025);
        Turma turma3 = new Turma("1-A", 2025);
        Turma turma4 = new Turma("1-A", 2025);

        Disciplina disciplina1 = new Disciplina("Lógica de programação", 500, professor3);
        Disciplina disciplina2 = new Disciplina("Engenharia de Software", 40, professor2);
        Disciplina disciplina3 = new Disciplina("Matemática", 50, professor1);
        Disciplina disciplina4 = new Disciplina("Banco de dados", 420, professor4);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);
        escola.adicionarAluno(aluno4);

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.adicionarProfessor(professor3);
        escola.adicionarProfessor(professor4);

        escola.adicionarTurma(turma1);
        escola.adicionarTurma(turma2);
        escola.adicionarTurma(turma3);
        escola.adicionarTurma(turma4);

        escola.adicionarDisciplina(disciplina1);
        escola.adicionarDisciplina(disciplina2);
        escola.adicionarDisciplina(disciplina3);
        escola.adicionarDisciplina(disciplina4);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);

        turma2.adicionarAluno(aluno3);
        turma2.adicionarAluno(aluno4);

        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno4);

        turma4.adicionarAluno(aluno3);
        turma4.adicionarAluno(aluno2);

        System.out.println();

        escola.listarAlunos();

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();

        escola.listarProfessor();

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();

        escola.listarTurmas();

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();

        escola.listarDisciplinas();

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();
    }
}