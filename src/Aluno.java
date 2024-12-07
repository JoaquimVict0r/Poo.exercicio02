import java.util.Scanner;
public class Aluno {

    String nome;
    int idade,matricula;

    void cadastrarAluno () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        nome=sc.nextLine();
        System.out.println("Digite a idade do aluno");
        idade=sc.nextInt();
        System.out.println("Digite a matricula do aluno");
        matricula=sc.nextInt();
    }
    void exibirAluno(){
        System.out.println("Nome do Aluno : " + nome);
        System.out.println("Idade do ALuno : " + idade);
        System.out.println("Matricula do aluno : " + matricula);
    }

}
