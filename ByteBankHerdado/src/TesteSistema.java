public class TesteSistema {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador admin = new Administrador();
        admin.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(admin);

    }

}
