public class FuncionarioTeste {

    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; //Tipo 0 = funcionario comum | Tipo 1 = Gerente | Tipo 2 = Diretor

    public FuncionarioTeste() {
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getbonificacao() {
        if (this.tipo == 0) {
            return this.salario * 0.10;
        } else if (this.tipo == 1) {
            return this.salario;
        } else {
            return this.salario + 1000;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

