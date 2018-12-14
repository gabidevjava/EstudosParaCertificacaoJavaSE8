package teste;

import banco.modelo.Administrador;
import banco.modelo.Cliente;
import banco.modelo.Gerente;
import banco.modelo.SistemaInterno;

public class TesteSistema {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador admin = new Administrador();
        admin.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(admin);
        si.autentica(cliente);

    }

}
