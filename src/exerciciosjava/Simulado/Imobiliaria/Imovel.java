package exerciciosjava.Simulado.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public abstract class Imovel implements ExibeDados, Comparable<Imovel>{
    private String endereco;
    private double valorAluguel;
    private StatusImovel statusImovel;
    private List<Aluguel> alugueis = new ArrayList<>();
    private Proprietario proprietario;

    public Imovel(String endereco, double valorAluguel, StatusImovel statusImovel, Proprietario proprietario) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.statusImovel = statusImovel;
        this.proprietario = proprietario;
        this.proprietario.adicionarImovel(this);
    }

    public void adicionarAluguel(Aluguel aluguel){
        alugueis.add(aluguel);
    }

    @Override
    public int compareTo(Imovel outro) {
        return Double.compare(this.valorAluguel, outro.valorAluguel);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Valor Aluguel: " + this.getValorAluguel());
        System.out.println("Status do imóvel: " + this.getStatusImovel());
    }

    public Inquilino obterInquilinoAtual() {
        for (Aluguel a : alugueis) {
            if (a.getStatusAluguel() == StatusAluguel.ATIVO) {
                return a.getInquilino();
            }
        }
        return null;
    }

    public abstract double calcularValorSeguro();

    public StatusImovel getStatusImovel() {
        return statusImovel;
    }

    public void setStatusImovel(StatusImovel statusImovel) {
        this.statusImovel = statusImovel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
}
