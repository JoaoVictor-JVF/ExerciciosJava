package exerciciosjava.heranca.Ex02;

public class AlunoPosGraduacao extends Aluno{
    private String tituloMonografia;
    public boolean monografiaDefendida;

    public AlunoPosGraduacao(String cpf, String nome, String protuario, double ira, String tituloMonografia, boolean monografiaDefendida) {
        super(cpf, nome, protuario, ira);
        this.setMonografiaDefendida(monografiaDefendida);
        this.setTituloMonografia(tituloMonografia);
    }

    @Override
    public String toString() {
        return "AlunoPosGraduacao{" +
                "tituloMonografia='" + tituloMonografia + '\'' +
                ", monografiaDefendida=" + monografiaDefendida +
                "} " + super.toString();
    }

    @Override
    public String obterSituacao() {
        if (getIra() >= 8.0 && monografiaDefendida) {
            return "Aprovado";
        }
        return "Reprovado";
    }


    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }

    public boolean isMonografiaDefendida() {
        return monografiaDefendida;
    }

    public void setMonografiaDefendida(boolean monografiaDefendida) {
        this.monografiaDefendida = monografiaDefendida;
    }
}
