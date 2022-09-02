public class Principal {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        conta1.titular = "Adrilene";
        conta1.numero = "1010-10";
        conta1.saldo = 800.40;

        Conta conta2 = new Conta();
        conta2.titular = "Denis";
        conta2.numero = "1212-12";
        conta2.saldo = 400.50;

        conta1.depositar(200);
        conta2.depositar(100);

        conta1.sacar(20);
        conta2.sacar(400);


        conta1.transferir(100.40, conta2);
    }
}
