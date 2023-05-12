public class FP10_Ex6 {
    public static void main(String[] args) {

// criar atletas
        Atleta a1 = new Atleta("Usain Bolt", "Atletismo", 1.95, 94.0, "Jamaica");
        Atleta a2 = new Atleta("Simone Biles", "Ginástica", 1.42, 47.0, "Estados Unidos");
        Atleta a3 = new Atleta("Cristiano Ronaldo", "Futebol", 1.87, 84.0, "Portugal");

// criar uma competição e adicionar alguns atletas
        Competicao c1 = new Competicao("Olimpíadas 2023", "Japão");

        c1.adicionarAtleta(a1);
        c1.adicionarAtleta(a2);

// imprimir informações da competição
        c1.imprimirInfoCompeticao();

    }
}
