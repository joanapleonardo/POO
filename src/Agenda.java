import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    Scanner sc = new Scanner(System.in);
        private ArrayList<Pessoa2> contactos;

    public Agenda(ArrayList<Pessoa2> pessoas) {
        this.contactos = pessoas;
    }

    public void adicionarPessoa() {

        String opcao;
        String nome = "";
        int idade = 0;
        String email = "";
        int telemovel = 0;


        System.out.println("Introduza a opção: ok/sair");
        opcao = sc.nextLine();

        while(!opcao.equals("sair")){
            System.out.println("Nome: ");
            nome = sc.nextLine();

            System.out.println("Idade: ");
            idade = sc.nextInt();

            System.out.println("Email: ");
            email = sc.next();

            System.out.println("Telemovel: ");
            telemovel = sc.nextInt();

            //sc.nextLine();

            this.contactos.add(new Pessoa2(nome,idade,email,telemovel));
            System.out.println("Introduza a opção: ok/sair");

            opcao = sc.nextLine();
        }

    }

    public void listarPessoas() {
        for (Pessoa2 pessoa2 : this.contactos) {
            System.out.println(pessoa2.getNome() + " - " + pessoa2.getIdade() + " anos - " + pessoa2.getEmail() + " - " + pessoa2.getTelemovel());
        }
    }


}