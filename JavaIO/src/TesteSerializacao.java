import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

/*        Cliente cliente = new Cliente();
        cliente.setNome("Gabriela Guedes");
        cliente.setProfissao("Dev");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.json"));
        oos.writeObject(cliente);
        oos.close();*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.json"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());

    }
}
