package Ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public sealed class Veiculo permits Moto, Carro{
    private String placa;
    private String modelo;
    private List<Manutencao> manutencoes = new ArrayList<>();

    public Veiculo(String placa, String modelo) {
        this.setModelo(modelo);
        this.setPlaca(placa);
    }

    public void adicionarManutencao(Manutencao manutencao) {
        this.manutencoes.add(manutencao);
    }

    public Iterator<Manutencao> obterManutencoes(){
        return Collections.unmodifiableList(this.manutencoes).iterator();
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", manutencoes=" + manutencoes +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
