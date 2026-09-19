package Ex01;

public class Conta {
    private String numero;
    private double saldo;

    public void sacar(double valor){
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
        }
        return;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
        return;
    }

    public Conta(String numero, double saldo) {
        this.setNumero(numero);
        this.setSaldo(saldo);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
