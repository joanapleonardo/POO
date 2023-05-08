public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularPerimetro(){
        double perimetro = (this.largura*2)+(this.altura*2);
        return perimetro;
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }




}
