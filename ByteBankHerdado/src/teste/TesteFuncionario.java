package teste;

import banco.modelo.ControleBonificacao;
import banco.modelo.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Gabriela");
        g.setSalario(5000.0);

        ControleBonificacao bonificacao = new ControleBonificacao();
        bonificacao.registra(g);
        System.out.println(bonificacao.getSoma());

    }
}
