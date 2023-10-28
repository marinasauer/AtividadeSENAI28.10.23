import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor fabio = new Professor("Fabio Santos", 40, 5780.00);
        Professor abner = new Professor("Abner Silva", 32, 4500);
        Professor marcelo = new Professor("Marcelo Souza", 38, 3603.20);

        Turma devSis = new Turma("Desenvolvimento de Sistemas BNU/2023");
        Turma adm = new Turma("Administração BNU/2023");
        Turma designModa = new Turma("Desing de Moda BNU/2023");

        Aluno marina = new Aluno("Marina Sauer", 31, 6.0);
        Aluno felipe = new Aluno("Felipe Sasse", 36,8.5);
        Aluno samara = new Aluno("Samara Slatter", 35, 4.9);

        Scanner input = new Scanner(System.in);

        devSis.adicionarProfessor(fabio);
        devSis.adicionarAluno(marina);
        devSis.adicionarAluno(felipe);
        devSis.adicionarAluno(samara);

        devSis.visualizarTurma();




    }
}