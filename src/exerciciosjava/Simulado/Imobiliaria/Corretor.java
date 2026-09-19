package exerciciosjava.Simulado.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Corretor extends Pessoa{
    private String creci;
    private static double totalComissoes = 0;

    public Corretor(String cpf, String nome, String creci, double totalComissoes) {
        super(cpf, nome);
        this.setCreci(creci);
        this.setTotalComissoes(totalComissoes);
    }

    public void calcularComissao(double valorAluguel){
        if(valorAluguel <= 0)
            throw new IllegalArgumentException("Valor do alugule inválido!");
        setTotalComissoes(0.06 * valorAluguel);
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public double getTotalComissoes() {
        return totalComissoes;
    }

    public void setTotalComissoes(double totalComissoes) {
        this.totalComissoes += totalComissoes;
    }
}
