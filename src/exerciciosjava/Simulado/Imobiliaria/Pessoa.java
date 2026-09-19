package exerciciosjava.Simulado.Imobiliaria;

public abstract class Pessoa implements ExibeDados{
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.setCpf(cpf);
        this.setNome(nome);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
