public class Produto {

    private String nome;
    private double preco;
    private int stock = 0;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getStock() {
        return this.stock;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void comprar(int quantidade) {
        this.stock += quantidade;
    }

    public void vender(int quantidade) {
        if (this.stock >= quantidade) {
            this.stock -= quantidade;
        } else {
            System.out.println("Sem stock");
        }
    }
}
