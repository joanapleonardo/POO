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

    public double calcularValor(){
        if(this.tipoImovel.equals(TipoImovel.APARTAMENTO)){
           double valor = this.area*1000;
        }else if(this.tipoImovel.equals(TipoImovel.CASA)){
            double valor = this.area*3000;
        }else if(this.tipoImovel.equals(TipoImovel.MANSAO)) {
            double valor = this.area * 5000;
        }
    return valor;
}
