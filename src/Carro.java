import javax.sound.midi.Soundbank;

public class Carro {

    //atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico, potencia, cilindrada;
    private Combustivel combustivel;
    private double litros100Km;


    //Método construtor
    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double litros100Km, Combustivel combustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.litros100Km = litros100Km;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public double getLitros100Km() {
        return litros100Km;
    }

    public void ligar(){
        if((2023-this.anoFabrico)>30){
            if(this.combustivel.equals(Combustivel.DIESEL)){
                System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else{
                System.out.println("Custa a pegar… O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        }else{
            if(this.potencia<250){
                System.out.println("O carro está ligado!");
                System.out.println("Vruummmmmmm");
            }else{
                System.out.println("O carro está ligado!");
                System.out.println("VRUUMMMMMM");
            }
        }
    }
    public void acelerar() {
        System.out.println("Vrrrrrm");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabrico(int anoFabrico) {
        this.anoFabrico = anoFabrico;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public void setLitros100Km(double litros100Km) {
        this.litros100Km = litros100Km;
    }
}
