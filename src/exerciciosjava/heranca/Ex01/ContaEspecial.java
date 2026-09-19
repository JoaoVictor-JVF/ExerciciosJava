package exerciciosjava.heranca.Ex01;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(this.limite >= valor)
            super.sacar(valor);
    }

    @Override
    public double obterSaldo() {
        {
            return super.obterSaldo() + this.limite;
        }
    }
}
