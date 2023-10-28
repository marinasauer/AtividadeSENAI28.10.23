import java.util.ArrayList;

public class Turma {

    private String nome;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    private Professor professor;



    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor){
        this.professor = professor;
    }

    public void visualizarTurma() {
        System.out.println("Turma: " + getNome());
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
        System.out.println("Professor Responsável: " + professor.getNome());
    }
}
