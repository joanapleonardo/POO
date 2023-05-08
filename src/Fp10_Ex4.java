import java.sql.SQLOutput;

public class Fp10_Ex4 {

    public static void main(String[] args) {

        Imovel xpto = new Imovel("Rua das Fontes", "Porto", 77, 2, 1, 89, 0, TipoImovel.APARTAMENTO,Acabamento.USADA);

        Imovel abcd = new Imovel("Rua da Flor", "Matosinhos", 24, 3, 2, 120, 5, TipoImovel.CASA, Acabamento.USADA);

        xpto.imprimirDescricao();

        System.out.println("O valor do imóvel é: " + xpto.calcularValor());

        xpto.setEstado(Acabamento.NOVA_ALTO_ACABAMENTO);

        xpto.imprimirDescricao();

        System.out.println("O valor do imóvel é: " + xpto.calcularValor());


        Imovel maisCaro = xpto.compararImoveis(abcd);
        System.out.println("O imóvel mais caro é o da " + maisCaro.getRua());

    }


}
