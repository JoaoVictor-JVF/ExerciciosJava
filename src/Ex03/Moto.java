package Ex03;

public final class Moto extends Veiculo{
    private double cilindradas;

    public Moto(String placa, String modelo, double cilindradas) {
        super(placa, modelo);
        this.setCilindradas(cilindradas);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                "} " + super.toString();
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }
}
