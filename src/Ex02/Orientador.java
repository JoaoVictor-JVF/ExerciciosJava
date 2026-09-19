package Ex02;

public class Orientador extends Pessoa{
    private String matricula;

    public Orientador(String cpf, String nome, String matricula) {
        super(cpf, nome);
        this.setMatricula(matricula);
    }

    @Override
    public String toString() {
        return "Orientador{" +
                "matricula='" + matricula + '\'' +
                "} " + super.toString();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
