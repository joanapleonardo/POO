import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Cao bobby = new Cao("Bobby", "Beagle");
        Cao bolinhas = new Cao("Bolinhas", "Caniche");
        Cao max = new Cao("Max", "Pastor Alemão");

        System.out.println("Nome do primeiro cão: "+bobby.getNome());
        System.out.println("Raça do primeiro cão: "+bobby.getRaca());

        System.out.println();

        System.out.println("Nome do segundo cão: "+bolinhas.getNome());
        System.out.println("Raça do segundo cão: "+bolinhas.getRaca());

        System.out.println();

        System.out.println("Nome do terceiro cão: "+max.getNome());
        System.out.println("Raça do terceiro cão: "+max.getRaca());

        //Alterar a raça do Bobby para Golden Retriever

        max.setRaca("Serra da Estrela");

        System.out.println("\nValores atualizados\n");

        System.out.println("Nome do primeiro cão: "+bobby.getNome());
        System.out.println("Raça do primeiro cão: "+bobby.getRaca());

        System.out.println();

        System.out.println("Nome do segundo cão: "+bolinhas.getNome());
        System.out.println("Raça do segundo cão: "+bolinhas.getRaca());

        System.out.println();

        System.out.println("Nome do terceiro cão: "+max.getNome());
        System.out.println("Raça do terceiro cão: "+max.getRaca());

    }
}
