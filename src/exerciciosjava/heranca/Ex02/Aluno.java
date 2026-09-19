package exerciciosjava.heranca.Ex02;

public class Aluno extends Pessoa{
    private String prontuario;
    private double ira;
    private Curso curso;

    public Aluno(String cpf, String nome, String prontuario, double ira) {
        super(cpf, nome);
        this.setProtuario(prontuario);
        this.setIra(ira);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "prontuario='" + prontuario + '\'' +
                ", ira=" + ira +
                "} " + super.toString();
    }

    public String obterSituacao(){
        if(this.ira >= 8.0){
            return "Aprovado";
        }

        return "Reprovado";
    }

    public String getProtuario() {
        return prontuario;
    }

    public void setProtuario(String protuario) {
        this.prontuario = protuario;
    }

    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }
}
