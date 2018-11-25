public class Gerente extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticacaoUtil;

    public Gerente() {
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    public double getbonificacao() {
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticacaoUtil.autentica(senha);
    }

}

