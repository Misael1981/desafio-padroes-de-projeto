package one.digitalinnovation.gof.mensagem;

public class MensagemFactory {

    public static Mensagem getMensagem(int i) {

        if (i == 1) {
            return new MensagemSms();
        } else if (i == 2) {
            return new MensagemEmail();
        } else {
            return null;
        }
    }
}
