public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriela");
        funcionario.setCpf("222.222.222-56");
        funcionario.setSalario(10000);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getbonificacao());

        FuncionarioTeste funcionarioTeste = new FuncionarioTeste();

        funcionarioTeste.setSalario(10000);
        System.out.println(funcionarioTeste.getTipo());
        System.out.println(funcionarioTeste.getbonificacao());

    }
}
