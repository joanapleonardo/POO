import java.util.EnumMap;

public class Imovel {
    String rua, cidade;
    int numPorta, numQuartos, numWC;
    double area, areaPiscina;
    private TipoImovel tipoImovel;
    private Acabamento acabamento;

    public Imovel(String rua, String cidade, int numPorta, int numQuartos, int numWC, double area, double areaPiscina, TipoImovel tipoImovel, Acabamento acabamento) {
        this.rua = rua;
        this.cidade = cidade;
        this.numPorta = numPorta;
        this.numQuartos = numQuartos;
        this.numWC = numWC;
        this.area = area;
        this.areaPiscina = areaPiscina;
        this.tipoImovel = tipoImovel;
        this.acabamento = acabamento;
    }

    public double calcularValor() {

        double valor = 0;

        if (this.tipoImovel.equals(TipoImovel.APARTAMENTO)) {
            valor += area * 1000;
        } else if (this.tipoImovel.equals(TipoImovel.CASA)) {
            valor += area * 3000;
        } else if (this.tipoImovel.equals(TipoImovel.MANSAO)) {
            valor = area * 5000;
        }

        if (this.acabamento.equals(Acabamento.RESTAURO)) {
            valor *= 0.5;
        } else if (this.acabamento.equals(Acabamento.USADA)) {
            valor *= 0.1;
        } else if (this.acabamento.equals(Acabamento.NOVA_ALTO_ACABAMENTO)) {
            valor *= 1.25;
        }

        valor += numQuartos * 7500;
        valor += numWC * 10500;
        valor += areaPiscina * 1000;

        return valor;
    }

    public void setEstado(Acabamento novoAcabamento){
        this.acabamento = novoAcabamento;
    }

    public void imprimirDescricao() {
        System.out.println("\n");
        System.out.println("Imóvel localizado na " + this.rua + ", " + this.numPorta + ", " + this.cidade);
        System.out.println("Tipo: " + this.tipoImovel);
        System.out.println("Acabamento: " + this.acabamento);
        System.out.println("Área: " + area + "m²");
        System.out.println("Número de quartos: " + this.numQuartos);
        System.out.println("Número de casas de banho: " + this.numWC);
        System.out.println("Área da piscina: " + this.areaPiscina + "m²");
        System.out.println("Estado: " + this.acabamento);
        System.out.println("\n");
    }

    public Imovel compararImoveis(Imovel outroImovel) {
        double imovel = this.calcularValor();
        double imovel2 = outroImovel.calcularValor();

        if (imovel > imovel2) {
            return this;
        } else {
            return outroImovel;
        }

    }

    public String getRua(){
        return rua;
    }

}



