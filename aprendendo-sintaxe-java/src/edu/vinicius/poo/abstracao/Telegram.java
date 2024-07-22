package edu.vinicius.poo.abstracao;

public class Telegram extends ServicoMensagemInstantanea {
    /*
     * Se não houver os métodos abstratos da classe pai, a classe ficará com erro.
     */

     public void enviarMensagem() {
        // aqui estamos dizendo como o método deve ser feito nessa classe.
         System.out.println("Enviando mensagem pelo Telegram");
     }

     public void receberMensagem() {
        // aqui estamos dizendo como o método deve ser feito nessa classe.
        System.out.println("Recebendo mensagem pelo Telegram");
     }
}
