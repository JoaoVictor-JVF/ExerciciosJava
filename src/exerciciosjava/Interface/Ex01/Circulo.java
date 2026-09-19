package exerciciosjava.Interface.Ex01;

public class Circulo implements FiguraPlana{
    private double raio;

    public Circulo(double raio) {
        this.setRaio(raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
