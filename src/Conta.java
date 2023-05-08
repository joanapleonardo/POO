public class Conta {

    int numConta, anoAbertura;
    double saldo, margemEmprestimo, valorDivida;
    private String titular;


    public Conta(int numConta, double saldo, String titular){
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
        this.anoAbertura=2023;
        this.valorDivida=0;
        this.margemEmprestimo=this.saldo*0.9;
    }

    public double depositar(double valor){
        this.saldo += valor;
        return valor;
    }

    public double levantar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para continuar a operação.");
        }
        return this.saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean transferencia(double valor, Conta contaDestino) {

        //verificar se a conta de origem tem saldo suficiente
        if (this.saldo >= valor) {
            //subtraio ao saldo da conta de origem
            this.saldo -= valor;
            //adiciono ao saldo da conta de destino
            contaDestino.saldo+=valor;
            System.out.println("Transferência concluida");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public boolean emprestimo(double valor){
        if(valor <= this.margemEmprestimo && this.valorDivida <= margemEmprestimo){
            this.saldo += valor;
            this.valorDivida += valor;
            System.out.println("Empréstimo concedido no valor de " + valor + " euros. Saldo atual: " + this.saldo +" euros.");
            return true;
        }else{
            System.out.println("Empréstimo não concedido");
            return false;
        }
    }




}
