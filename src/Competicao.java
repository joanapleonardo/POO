import java.util.ArrayList;
import java.util.Scanner;
public class Competicao {
    private String nome;
    private String pais;
    private ArrayList<Atleta> participantes;

    public Competicao(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.participantes = new ArrayList<>();
    }

    public void adicionarAtleta(Atleta atleta) {
        participantes.add(atleta);
    }

    public void adicionarCompeticao(Competicao competicao) {
        // implementação para adicionar competições se necessário
    }

    public void imprimirInfoCompeticao() {
        System.out.println("Nome da competição: " + nome);
        System.out.println("País: " + pais);
        System.out.println("Atletas participantes:");
        for (Atleta atleta : participantes) {
            System.out.println("- " + atleta.getNome() + " (" + atleta.getModalidade() + ")");
        }
    }

}