public class TesteFuncionario {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Gabriela");
        g.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        ControleBonificacao bonificacao = new ControleBonificacao();
        bonificacao.registra(g);
        bonificacao.registra(f);
        System.out.println(bonificacao.getSoma());

    }
}
