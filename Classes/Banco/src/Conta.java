public class Conta {
    String titular;
    String numero;
    double saldo;

    void depositar(double valor){
        this.saldo += valor;
        System.out.println("Valor depositado na conta de " + this.titular);
        System.out.println("Novo saldo: "+ this.saldo);
    }

    void sacar(double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Valor retirado na conta de " + this.titular);
            System.out.println("Novo saldo: "+ this.saldo);
        } else {
            System.out.println("Não foi possível realizar o saque.");
            System.out.println("Saldo disponível: "+ this.saldo);
        }
    }

    void transferir(double valor, Conta contaRecebedor){
        if (this.saldo >= valor){
            contaRecebedor.depositar(valor);
            this.sacar(valor);
        } else {
            System.out.println("Não foi possível realizar a transferência.");
            System.out.println("Saldo disponível: "+ this.saldo);
        }

    }
}
