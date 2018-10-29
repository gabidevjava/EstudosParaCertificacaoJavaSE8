public class CriaConta {

    public static void main(String[] args) {

        Cliente gabriela = new Cliente();
        gabriela.setNome("Gabriela Rayssa");
        gabriela.setCpf("058.564.871-92");
        gabriela.setProfissao("Desenvolvedora Web e Mobile");

        Conta conta =  new Conta(34, 8989898);

    }
}
