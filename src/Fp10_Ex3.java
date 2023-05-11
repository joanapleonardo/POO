import java.util.ArrayList;

public class Fp10_Ex3 {
    public static void main(String[] args) {

        ArrayList <String> alimento = new ArrayList<>();
        alimento.add("palha");
        alimento.add("cenouras");
        alimento.add("maças");
        alimento.add("couves");

        Animal burro = new Animal("Zacarias", "Burro", "Portugal", 235.50, alimento);
        System.out.println("Peso: "+burro.getPeso());

        System.out.println("Vai comer agora...");
        burro.comer(2500, "couves");
        System.out.println("Peso: "+burro.getPeso());
    }
}
