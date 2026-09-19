package exerciciosjava.Simulado.Imobiliaria;

public final class Casa extends Imovel{
    private String quadra;
    private String lote;

    public Casa(String endereco, double valorAluguel, StatusImovel statusImovel, Proprietario proprietario, String quadra, String lote) {
        super(endereco, valorAluguel, statusImovel, proprietario);
        this.quadra = quadra;
        this.lote = lote;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Qaudra: " + this.getQuadra());
        System.out.println("Lote: " + this.getLote());
    }

    @Override
    public double calcularValorSeguro() {
        return 0.2 * this.getValorAluguel();
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
