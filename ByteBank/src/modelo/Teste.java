package modelo;

public class Teste {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc = new ContaCorrente(11,22);
        guardador.adiciona(cc);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencias(0);
        System.out.println(ref.getNumero());

    }

}
