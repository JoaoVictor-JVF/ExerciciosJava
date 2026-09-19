package exerciciosjava.Simulado.Imobiliaria;

public final class Apartamento extends Imovel{
    private String nomeEdificio;
    private int andar;

    public Apartamento(String endereco, double valorAluguel, StatusImovel statusImovel, Proprietario proprietario, String nomeEdificio, int andar) {
        super(endereco, valorAluguel, statusImovel, proprietario);
        this.nomeEdificio = nomeEdificio;
        this.andar = andar;
    }

    @Override
    public double calcularValorSeguro() {
        return 0.1 * this.getValorAluguel();
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Nome do edifício: " + this.getNomeEdificio());
        System.out.println("Número do andar: " + this.getAndar());
    }

    public String getNomeEdificio() {
        return nomeEdificio;
    }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
}
