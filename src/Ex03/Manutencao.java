package Ex03;

import java.time.LocalDate;

public class Manutencao {
    private LocalDate data;
    private double custo;
    private Mecanico mecanico;
    private Veiculo veiculo;

    public Manutencao(LocalDate data, double custo, Mecanico mecanico, Veiculo veiculo) {
        this.setData(data);
        this.setCusto(custo);
        this.setMecanico(mecanico);
        this.setVeiculo(veiculo);
    }

    @Override
    public String toString() {
        return "Manutencao{" +
                "data=" + data +
                ", custo=" + custo +
                ", mecanico=" + mecanico.getNome() +
                ", veiculo='" + veiculo.getPlaca() + " - " + veiculo.getModelo() + '\'' +
                '}';
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
}
