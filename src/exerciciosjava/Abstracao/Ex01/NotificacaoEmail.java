package exerciciosjava.Abstracao.Ex01;

import java.time.LocalDateTime;

public class NotificacaoEmail extends Notificacao{
    private String email;

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando notificação para: " + this.email);
    }

    public NotificacaoEmail(String notificacao, LocalDateTime data, String email) {
        super(notificacao, data);
        this.setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
