package exerciciosjava.Abstracao.Ex02;

public class Poupanca extends Conta{
    private double taxaRendimento;

    public Poupanca(String numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.setTaxaRendimento(taxaRendimento);
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0)
            this.setSaldo(this.obterSaldo() - valor);
    }

    @Override
    public double obterSaldo() {
        return getSaldo() + (getSaldo() * taxaRendimento);
    }

    public void aplicarRendimento() {
        setSaldo(obterSaldo());
    }


    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
