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

        Funcionario gerente = new Gerente();

        gerente.setNome("Gabriela");
        String nome = gerente.getNome();

        System.out.println(nome);

    }
}
