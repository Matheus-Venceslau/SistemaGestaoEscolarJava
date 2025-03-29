import models.Aluno;
import models.Escola;
import models.Professor;

public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola("Escola Senai");

        Aluno aluno1 = new Aluno("Carlos Silva", 15, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");
        Aluno aluno3 = new Aluno("Matheus Venceslau", 18, "A523");
        Aluno aluno4 = new Aluno("Pedro de Paula", 18, "F123");

        Professor professor1 = new Professor("João Pereira", "Matemática", 50);
        Professor professor2 = new Professor("Ana Costa", "Português", 60);
        Professor professor3 = new Professor("Célia Eterna", "Lógica de Programação", 500);
        Professor professor4 = new Professor("Lucimara", "Banco de dados", 65);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);
        escola.adicionarAluno(aluno4);

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.adicionarProfessor(professor3);
        escola.adicionarProfessor(professor4);
        
        System.out.println();

        escola.listarAlunos();

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();

        escola.listarProfessor();

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
    }
}