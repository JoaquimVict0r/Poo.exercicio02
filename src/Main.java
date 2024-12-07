public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.cadastrarAluno();
        aluno.exibirAluno();

        Aluno aluno2 = new Aluno();
        aluno2.cadastrarAluno();
        aluno2.exibirAluno();

        Professor professor = new Professor();
        professor.cadastrarProfessor();
        professor.exibirProfessor();

    }
}