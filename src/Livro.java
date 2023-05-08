public class Livro {

    private String titulo, autor, categoria;
    private int paginas, isbn;

    public Livro(String titulo, String autor, String categoria, int paginas, int isbn){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.paginas=paginas;
        this.isbn=isbn;
    }

    public void exibirDetalhes(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Páginas: "+this.paginas);
        System.out.println("ISBN: "+this.isbn);
    }

    //public void setAutor(){
      //  this.autor = autor;
    //}
}
