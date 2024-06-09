package one.digitalinnovation.gof;

import javax.swing.JOptionPane;

import one.digitalinnovation.gof.mensagem.Mensagem;
import one.digitalinnovation.gof.mensagem.MensagemFactory;

public class Principal {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null);

        Mensagem mensagem = MensagemFactory.getMensagem(1);
        mensagem.enviar(texto);
    }
}
