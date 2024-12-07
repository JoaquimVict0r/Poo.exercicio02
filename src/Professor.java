import java.util.Scanner;
public class Professor {

        String nome,disciplina,titulacao;

        void cadastrarProfessor () {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do Professor");
            this.nome=sc.nextLine();
            System.out.println("Digite a disciplina do Professor");
            disciplina =sc.nextLine();
            System.out.println("Digite a titulacao do Professor");
            titulacao=sc.nextLine();
        }
        void exibirProfessor(){
            System.out.println("Nome do Professor : " + nome);
            System.out.println("Disciplina do Professor : " + disciplina);
            System.out.println("Titulacao do professor  : " + titulacao);
        }

    }

