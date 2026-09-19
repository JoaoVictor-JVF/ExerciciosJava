package exerciciosjava.Simulado.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Inquilino extends Pessoa{
    private double rendaMensal;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Inquilino(String cpf, String nome, double rendaMensal) {
        super(cpf, nome);
        this.setRendaMensal(rendaMensal);
    }

    public void adicionarAluguel(Aluguel aluguel){
        this.alugueis.add(aluguel);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Renda mensal: R$ " + this.getRendaMensal());
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
}
