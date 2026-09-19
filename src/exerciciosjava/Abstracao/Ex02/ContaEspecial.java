package exerciciosjava.Abstracao.Ex02;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.setLimite(limite);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo() + getLimite())) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public double obterSaldo() {
        return getSaldo() + getLimite();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
