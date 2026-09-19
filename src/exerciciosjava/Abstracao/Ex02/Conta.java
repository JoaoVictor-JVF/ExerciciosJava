package exerciciosjava.Abstracao.Ex02;

public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public abstract double obterSaldo();

    public void depositar(double valor){
        if(valor > 0)
            this.saldo += valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
