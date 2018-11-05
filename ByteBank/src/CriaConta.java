public class CriaConta {

    public static void main(String[] args) {

        Cliente gabriela = new Cliente();
        gabriela.setNome("Gabriela Rayssa");
        gabriela.setCpf("222.222.222-90");
        gabriela.setProfissao("Desenvolvedora Web e Mobile");

        Conta conta =  new Conta(34, 8989898);

    }
}
