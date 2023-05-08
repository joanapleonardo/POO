import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantidade = 0;
        System.out.print("Insira o nome do produto: ");
        String nome = input.next();
        System.out.print("Insira o preço do produto: ");
        double preco = input.nextDouble();
        Produto produto = new Produto(nome, preco);

        int opcao;

        do {
            System.out.println("Controlo do produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());

            do {
                System.out.println("\n***** Menu *****");
                System.out.println("1 - Comprar ");
                System.out.println("2 - Vender ");
                System.out.println("3 - Consultar Stock ");
                System.out.println("4 - Sair ");
                System.out.println("\nEscolha uma opção");
                opcao = input.nextInt();

            } while (opcao < 1 || opcao > 4);

            switch (opcao) {
                case 1:
                    System.out.println("\n***** Comprar *****");
                    System.out.println("Quantas unidades quer comprar: ");
                    quantidade = input.nextInt();
                    produto.comprar((quantidade));
                    break;

                case 2:
                    System.out.println("\n***** Vender *****");
                    System.out.println("Quantas unidades quer vender: ");
                    quantidade = input.nextInt();
                    produto.vender(quantidade);
                    break;

                case 3:
                    System.out.println("\nTem " + produto.getStock() + " unidades em stock!\n");
                    break;

                case 4:
                    System.out.println("Até à próxima");
            }
        } while (opcao != 4);


    }
}
