package exerciciosjava.Abstracao.Ex01;

import java.time.LocalDateTime;

public class NotificacaoSMS extends Notificacao{
    private String telefone;

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando notificação para: " + this.telefone);
    }

    public NotificacaoSMS(String notificacao, LocalDateTime data, String telefone) {
        super(notificacao, data);
        this.setTelefone(telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
