import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Conta conta_A = new Conta(100, 5250.67,"Joaquim Fernandes");
        Conta conta_B = new Conta(200, 1234.45,"Idalina Fonseca");
        Conta conta_C = new Conta(300, 580.23,"Josefa Botelho");

        System.out.println("\n***** Depositar *****");
        System.out.println("Qual o valor a depositar: ");
        double valor = input.nextDouble();
        conta_A.depositar(valor);

        System.out.println("Saldo atual: " + conta_A.getSaldo() );

        System.out.println("\n***** Levantar *****");
        System.out.println("Qual o valor a levantar: ");
        valor = input.nextDouble();
        conta_A.levantar(valor);

        System.out.println("Saldo atual: " + conta_A.getSaldo() );

        conta_B.transferencia(500,conta_C);
        conta_C.transferencia(600,conta_A);


        System.out.println("Saldo atual da conta B: " + conta_B.getSaldo() );
        System.out.println("Saldo atual da conta C: " + conta_C.getSaldo() );

    }
}
