public class Conta {

    int numConta;
    double saldo;
    private String titular;


    public Conta(int numConta, double saldo, String titular){
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
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




}
