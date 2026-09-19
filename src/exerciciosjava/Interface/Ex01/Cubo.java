package exerciciosjava.Interface.Ex01;

public class Cubo implements FiguraTridimensional{
    private double aresta;

    public Cubo(double aresta) {
        this.setAresta(aresta);
    }

    @Override
    public double calcularVolume() {
        return aresta * aresta * aresta;
    }

    @Override
    public double calcularArea() {
        return 6 * aresta * aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
