public class CriaConta {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(111,111);
        contaCorrente.deposita(900);

        ContaPoupanca contaPoupanca = new ContaPoupanca(900, 500);
        contaPoupanca.deposita(124.90);

        contaCorrente.transfere(100, contaPoupanca);
        System.out.println("Conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta poupança: " + contaPoupanca.getSaldo());


    }
}
