public class Cao {

    private String nome;

    private String raca;

//Método construtor
    public Cao(String nome, String raca){
        this.nome=nome;
        this.raca=raca;
    }

    //Métodos get
    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    //Método set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir(){
        System.out.println("Au Au!");
    }
}
