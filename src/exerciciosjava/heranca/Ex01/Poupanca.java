package exerciciosjava.heranca.Ex01;

public class Poupanca extends Conta{
    double taxaRendimento;

    public Poupanca(String numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.setTaxaRendimento(taxaRendimento);
    }

    public void aplicarRendimento(){
        super.setSaldo(super.obterSaldo() * this.taxaRendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
