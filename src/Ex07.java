public class Ex07 {

    public  static void main(String[] args){

        //Instanciar livros
        Livro javaHeadsFirst = new Livro("Heads First Java", "Kathy Sierra", "Programação", 600, 11110022);
        Livro tresPorquinhos = new Livro("Os Três Porquinhos", "Desconhecido", "infantil", 10, 22220033);

        javaHeadsFirst.exibirDetalhes();
        System.out.println();
        tresPorquinhos.exibirDetalhes();


        //tresPorquinhos.setAutor("Popular");
        //tresPorquinhos.exibirDetalhes();
    }
}
