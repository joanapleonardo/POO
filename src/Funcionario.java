public class Funcionario {

    private String nome;
    double salario;
    private String departamento;


    public Funcionario(String nome, double salario, String departamento){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double porcentagem){
        this.salario *= (1 + porcentagem / 100);
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario + " €.");
        System.out.println("Departamento: " + this.departamento);
    }

}
