public class Pessoa2 {
    private String nome;
    int idade;
    private String email;
    int telemovel;

    public Pessoa2(String nome, int idade, String email, int telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public int getTelemovel() {
        return telemovel;
    }
}