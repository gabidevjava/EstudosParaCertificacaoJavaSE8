public class CriaConta {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(111,111);
        contaCorrente.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        CalculadorImposto calculadorImposto = new CalculadorImposto();

        calculadorImposto.registrar(contaCorrente);
        calculadorImposto.registrar(seguroDeVida);

        System.out.println(calculadorImposto.getTotalImposto());

    }
}
