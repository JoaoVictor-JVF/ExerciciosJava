package exerciciosjava.Simulado.Imobiliaria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluguel {
    private final LocalDate inicioContrato;
    private final LocalDate fimContrato;
    private StatusAluguel statusAluguel;
    private final Imovel imovel;
    private final Inquilino inquilino;
    private final Corretor corretor;

    public Aluguel(LocalDate inicioContrato, LocalDate fimContrato, StatusAluguel statusAluguel, Imovel imovel, Inquilino inquilino, Corretor corretor) {
        if(!validarPeriodo(inicioContrato, fimContrato))
            throw new IllegalArgumentException("Data do aluguel deve ser de pelo menos 6 meses!");
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
        this.statusAluguel = StatusAluguel.PENDENTE;
        this.imovel = imovel;
        this.inquilino = inquilino;
        this.corretor = corretor;
    }

    public static boolean validarPeriodo(LocalDate inicio, LocalDate fim) {
        long meses = ChronoUnit.MONTHS.between(inicio, fim);
        return meses >= 6;
    }

    public void confirmarAluguel(){
        if(!this.imovel.getStatusImovel().equals(StatusImovel.VAGO))
            throw new IllegalArgumentException("Imóvel não está disponível para locação!");
        if(!(this.inquilino.getRendaMensal() > 3 * this.imovel.getValorAluguel()))
            throw new IllegalArgumentException("Renda do inquilino não é pelo menos 3 vezes maior que o valor do aluguel do imóvel!");
        setStatusAluguel(StatusAluguel.ATIVO);
        this.imovel.setStatusImovel(StatusImovel.ALUGADO);
        this.corretor.calcularComissao(this.imovel.getValorAluguel());
        this.getImovel().adicionarAluguel(this);
        this.getInquilino().adicionarAluguel(this);
    }

    public void encerrarAluguel(){
        if(!this.getStatusAluguel().equals(StatusAluguel.ATIVO))
            throw new IllegalArgumentException("Aluguel não pode ser encerrado, pois não está ativo!");

        this.setStatusAluguel(StatusAluguel.ENCERRADO);
    }


    public LocalDate getInicioContrato() {
        return inicioContrato;
    }

    public LocalDate getFimContrato() {
        return fimContrato;
    }

    public StatusAluguel getStatusAluguel() {
        return statusAluguel;
    }

    public void setStatusAluguel(StatusAluguel statusAluguel) {
        this.statusAluguel = statusAluguel;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public Corretor getCorretor() {
        return corretor;
    }
}
