package exerciciosjava.Abstracao.Ex01;

import java.time.LocalDateTime;

public class NotificacaoPush extends Notificacao{
    private String dispositivo;

    public NotificacaoPush(String notificacao, LocalDateTime data, String dispositivo) {
        super(notificacao, data);
        this.setDispositivo(dispositivo);
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando notificação para: " + this.dispositivo);
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }
}
