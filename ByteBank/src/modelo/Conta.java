package modelo;

public abstract class Conta implements Comparable<Conta>{

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta");
    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor " + valor );
        }
        this.saldo -= valor;

    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero >= 0) {
            System.out.println("Não pode haver valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia >= 0) {
            System.out.println("Não pode haver valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
