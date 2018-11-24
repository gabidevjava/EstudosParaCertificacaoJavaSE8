public class Gerente extends Funcionario {

    private int senha;

    public Gerente() {
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getbonificacao() {
        return super.getSalario();
    }

    public int getTsenha() {
        return senha;
    }

    public void setTsenha(int senha) {
        this.senha = senha;
    }

}

