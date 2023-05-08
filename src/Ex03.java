import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double altura, largura;

    Retangulo fixo = new Retangulo(10,10);

        System.out.println("A altura do retângulo: ");
         altura = input.nextInt();

        System.out.println("A largura do retângulo: ");
         largura = input.nextDouble();

         Retangulo variavel = new Retangulo(largura, altura);

        System.out.println("Perimetro: " + variavel.calcularPerimetro());

        System.out.println("Área: " + variavel.calcularArea());

        //Exemplo que não estava no exercicio
        //Perceber qual o retangulo com maior area
        //O porquê de o método a utilizar não se void

        if(fixo.calcularArea() > variavel.calcularArea()){
            System.out.println("O retangulo fixo é maior");
        }
        else {
            System.out.println("O retângulo do utilizador é maior");
        }
    }
}

