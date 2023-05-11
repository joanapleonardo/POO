import java.util.ArrayList;

public class FP10_Ex5 {
    public static void main(String[] args) {

        ArrayList<Pessoa2> listPessoas = new ArrayList<Pessoa2>();

        Agenda agenda = new Agenda(listPessoas);
        Pessoa2 pessoa = new Pessoa2("Ana", 32, "ana@sapo.pt", 912345678);

        agenda.adicionarPessoa();
        agenda.listarPessoas();



    }
}
