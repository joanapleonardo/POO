import java.util.ArrayList;
import java.util.Scanner;

public class Atleta {

    public String nome, modalidade, paisOrigem;
    public double altura, peso;

    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.paisOrigem = paisOrigem;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

}