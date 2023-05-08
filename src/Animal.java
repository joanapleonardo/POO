import java.util.ArrayList;
public class Animal {

    public String nome, especie, paisOrigem;
    public Double peso;
    private ArrayList<String> listaAlimento;

    public Animal(String nome, String especie, String paisOrigem, Double peso, ArrayList<String> listaAlimento) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.listaAlimento = listaAlimento;
    }

    public Double getPeso() {
        return peso;
    }

    public boolean comer(double pesoComida, String alimentoDado) {

        for (String comidaQueCome : listaAlimento) {

            if (alimentoDado.equals(comidaQueCome)) {
                System.out.println("Comeu");
                this.peso += pesoComida / 1000;
                return true;
            }
        }

        System.out.println("Come tu!");
        return false;
    }
}