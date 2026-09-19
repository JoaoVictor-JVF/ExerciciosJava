package exerciciosjava.Interface.Ex01;

public class Main {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(4);
        Circulo c = new Circulo(3);
        Cubo cubo = new Cubo(2);

        System.out.println("Área do quadrado: " + q.calcularArea());
        System.out.println("Perímetro do quadrado: " + q.calcularPerimetro());
        System.out.println("Área do círculo: " + c.calcularArea());
        System.out.println("Perímetro do círculo: " + c.calcularPerimetro());
        System.out.println("Área do cubo: " + cubo.calcularArea());
        System.out.println("Volume do cubo: " + cubo.calcularVolume());
    }
}

