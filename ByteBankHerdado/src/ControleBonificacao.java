public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getbonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
}
