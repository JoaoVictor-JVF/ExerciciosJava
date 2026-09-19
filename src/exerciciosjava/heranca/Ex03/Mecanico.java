package exerciciosjava.heranca.Ex03;

public final class Mecanico extends Pessoa{
    double salario;

    public Mecanico(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "salario=" + salario +
                "} " + super.toString();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
