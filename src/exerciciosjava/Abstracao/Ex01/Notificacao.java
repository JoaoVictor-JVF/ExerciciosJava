package exerciciosjava.Abstracao.Ex01;

import java.time.LocalDateTime;

public abstract class Notificacao {
    private String mensagem;
    private LocalDateTime data;

    public abstract void enviarNotificacao();

    public Notificacao(String notificacao, LocalDateTime data) {
        this.setNotificacao(notificacao);
        this.setData(data);
    }

    public String getNotificacao() {
        return mensagem;
    }

    public void setNotificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
