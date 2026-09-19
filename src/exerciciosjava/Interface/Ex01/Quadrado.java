package exerciciosjava.Interface.Ex01;

public class Quadrado implements FiguraPlana{
    private double lado;

    public Quadrado(double lado) {
        this.setLado(lado);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
