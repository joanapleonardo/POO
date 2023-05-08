import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //instanciar um objecto da classe carro
        Carro mercedesA45 = new Carro("Mercedes", "A45", 2021, 60, 200,10, Combustivel.GASOLINA);
        Carro kiaPicanto = new Carro("Kia", "Picanto", 2003, 600, 200,5, Combustivel.DIESEL);

       Carro vencedor= mercedesA45.corrida(kiaPicanto);
        System.out.println("Numa corrida o vencedor seria: " +vencedor.getMarca()+" "+vencedor.getModelo());
        System.out.println("Numa viagem de 97Km, o Mercedes A45 consumiria " + mercedesA45.consumo(97) + " litros de combustível e o Kia Picanto " + kiaPicanto.consumo(97));

 /*
        //calcular consumo:
        System.out.println("O carro consumiu: " + mercedesA45.consumo(500));

        //corrida:
       mercedesA45.corrida(kiaPicanto);

        //Ligar o carro
        carroUtilizador.ligar();

        //Acelerar o carro
        mercedesA45.acelerar();


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

        */
    }
}
