package exerciciosjava.heranca.Ex02;

public class AlunoGraduacao extends Aluno{
    private double horasAtividadesComplementares;

    public AlunoGraduacao(String cpf, String nome, String protuario, double ira, double horasAtividadesComplementares) {
        super(cpf, nome, protuario, ira);
        this.horasAtividadesComplementares = horasAtividadesComplementares;
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" +
                "horasAtividadesComplementares=" + horasAtividadesComplementares +
                "} " + super.toString();
    }

    @Override
    public String obterSituacao() {
        if (getIra() >= 8.0 && horasAtividadesComplementares >= 100) {
            return "Aprovado";
        }
        return "Reprovado";
    }


    public double getHorasAtividadesComplementares() {
        return horasAtividadesComplementares;
    }

    public void setHorasAtividadesComplementares(double horasAtividadesComplementares) {
        this.horasAtividadesComplementares = horasAtividadesComplementares;
    }
}
