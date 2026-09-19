package exerciciosjava.heranca.Ex03;

public final class Carro extends Veiculo{
    private int capacidadePassageiros;

    public Carro(String placa, String modelo, int capacidadePassageiros) {
        super(placa, modelo);
        this.setCapacidadePassageiros(capacidadePassageiros);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "capacidadePassageiros=" + capacidadePassageiros +
                "} " + super.toString();
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
