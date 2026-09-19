package exerciciosjava.Simulado.Imobiliaria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Proprietario extends Pessoa{
    private String telefone;
    private String numContaBancaria;
    private List<Imovel> imoveis = new ArrayList<>();

    public Proprietario(String cpf, String nome, String telefone, String numContaBancaria) {
        super(cpf, nome);
        this.setTelefone(telefone);
        this.setNumContaBancaria(numContaBancaria);
    }

    public void adicionarImovel(Imovel imovel){
        this.imoveis.add(imovel);
    }

    public double calcularRendimentoMensal(){
        double soma = 0;
        for(Imovel i: imoveis){
            if(i.getStatusImovel().equals(StatusImovel.ALUGADO))
                soma += i.getValorAluguel();
        }
        return soma;
    }

    public Iterator<Imovel> obterImoveisVagos() {
        List<Imovel> vagos = new ArrayList<>();
        for (Imovel i : imoveis) {
            if (i.getStatusImovel() == StatusImovel.VAGO) {
                vagos.add(i);
            }
        }
        return vagos.iterator();
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Conta: " + this.getNumContaBancaria());
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNumContaBancaria() {
        return numContaBancaria;
    }

    public void setNumContaBancaria(String numContaBancaria) {
        this.numContaBancaria = numContaBancaria;
    }
}
