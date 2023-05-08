import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o nome do Funcionário -> ");
        String nome = input.next();

        System.out.print("Insira o salário do " + nome + " -> ");
        double salario = input.nextDouble();

        System.out.print("Insira o departamento " + nome + " -> ");
        String departamento = input.next();

        System.out.print("\n");

        Funcionario joao = new Funcionario(nome, salario, departamento);

        joao.exibirDados();

        System.out.println("\n Indique a porcentagem de aumento: ");
        int porcentagem = input.nextInt();

        joao.aumentarSalario(porcentagem);

        joao.exibirDados();





    }
}
