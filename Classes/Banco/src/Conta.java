public class Conta {
    String titular;
    String numero;
    double saldo;

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado o valor de " + valor + " na conta de " + this.titular);
        System.out.println("Novo saldo " + this.saldo);
    }

    void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Retirado o valor de " + valor + " na conta de " + this.titular);
            System.out.println("Novo saldo " + this.saldo);
        } else {
            System.out.println("Não é possível realizar o saque, pois o valor solicitado é maior que saldo disponível");
            System.out.println("Saldo disponível: " + this.saldo);
        }
    }
    void transferir(double valor, Conta contaDestino){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Retirado o valor de " + valor + " na conta de " + this.titular);
            System.out.println("Novo saldo " + this.saldo);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Não é possível realizar o saque, pois o valor solicitado é maior que saldo disponível");
            System.out.println("Saldo disponível: " + this.saldo);
        }
    }

}
