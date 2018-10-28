public class CriaConta {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.saldo = 200;
        System.out.println(conta.saldo);

        conta.saldo += 100;
        System.out.println(conta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 1300;

        System.out.println("Primeira conta têm " + conta.saldo);
        System.out.println("Segunda conta têm " + segundaConta.saldo);

    }
}
