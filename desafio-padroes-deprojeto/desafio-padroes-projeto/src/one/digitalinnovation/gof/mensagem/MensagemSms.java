package one.digitalinnovation.gof.mensagem;

public class MensagemSms implements Mensagem {

    @Override
    public void enviar(String mensagem) {

        System.out.println("SMS: " + mensagem);

    }

}
