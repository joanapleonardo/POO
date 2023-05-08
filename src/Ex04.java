import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar váriáveis
        double raio;
        String escolha;

        Circulo circunferencia = new Circulo(0);

        do {
            System.out.println("Introduza um raio: ");
            raio = input.nextInt();

            //instanciar o circulo
            circunferencia.setRaio(raio);

            //Imprimir info do circulo
            System.out.println(("Raio: " + circunferencia.getRaio()));
            System.out.println("Diametro: " + circunferencia.diametro());
            System.out.println("Circunferência/Perimetro: " + circunferencia.circunferencia());
            System.out.println("Área: " + circunferencia.areaCirculo());


            //Parte opcional para explicar o Set
            System.out.println("Deseja alterar o raio? s/n: ");
            escolha = input.next();

        }while(!escolha.equals("n"));
    }
}
