import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //do {
            System.out.println("\n ****** Apresente-nos o seu carro ****** \n");
            System.out.println("Insira a marca: ");
            String marca = input.next();

            System.out.println("Insira o modelo: ");
            String modelo = input.next();

            System.out.println("Insira o ano de fabrico: ");
            int ano = input.nextInt();

            System.out.println("Insira a potência: ");
            int potencia = input.nextInt();

            System.out.println("Insira a cilindrada: ");
            int cilindrada = input.nextInt();

            System.out.println("Insira o consumo em litros por 100Km: ");
            int litros100Km = input.nextInt();

            System.out.println("Insira o combustivel: ");
            Combustivel combustivel = Combustivel.valueOf(input.next().toUpperCase());


            //Instanciar Objeto da classe carro
            Carro carroUtilizador = new Carro(marca, modelo, ano, potencia, cilindrada, litros100Km, combustivel);

            System.out.println(carroUtilizador);

        //}while(opcao != 0)
        //Carro adversario = new Carro(marca,modelo,ano,potencia,cilindrada,litros100Km,combustivel);



        //}
        //instanciar um objecto da classe carro
        //Carro mercedesA45 = new Carro("Mercedes", "A45", 2021, 60, 200,8, Combustivel.GASOLINA);

        //Ligar o carro
        //carroUtilizador.ligar();

        //Acelerar o carro
        //mercedesA45.acelerar();
    }
}
