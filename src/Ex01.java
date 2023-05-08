import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "Joana";
        int idade = 34;
        double altura = 1.68;

        Pessoa Joana = new Pessoa(nome,idade,altura);
        Pessoa Ana = new Pessoa("Ana",20,1.60);

        System.out.println("Nome:"+ Joana.getNome());
        System.out.println("Idade:"+ Joana.getIdade());
        System.out.println("Altura:"+ Joana.getAltura());

        System.out.println();


        System.out.println("Nome:"+ Ana.getNome());
        System.out.println("Idade:"+ Ana.getIdade());
        System.out.println("Altura:"+ Ana.getAltura());

        System.out.println("\n_______________________________________\n");

        System.out.println("Insira o nome da pessoa: ");
        String nomePessoa = input.next();

        System.out.println("Insira a idade da pessoa: ");
        int idadePessoa = input.nextInt();

        System.out.println("Insira a altura da pessoa: ");
        double alturaPessoa = input.nextDouble();

        Pessoa pessoaInputUtilizador = new Pessoa(nomePessoa,idadePessoa,alturaPessoa);

        System.out.println("o nome da pessoa é: " +pessoaInputUtilizador.getNome());
        System.out.println("Tem "+pessoaInputUtilizador.getIdade()+ " anos.");
        System.out.println("E "+pessoaInputUtilizador.getAltura()+"metros de altura");

    }
}