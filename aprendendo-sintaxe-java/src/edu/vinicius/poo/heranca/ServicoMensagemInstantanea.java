package edu.vinicius.poo.heranca;

public class ServicoMensagemInstantanea {

    /*
     * Se tivesse que criar uma classe para cade rede social que teria um chat de mensagens instantânea,
     * você poderia pensar em criar um código de mensagem instantânea e copia-lo para as diversas redes sociais.
     * Porém, há uma maneira melhor de fazer isso, através da HERANÇA
     * que consiste em ter uma classe pai que teria os métodos gerais que serviriam para qualquer rede social e assim poupando ter que copiar o mesmo código para diversas redes sociais.
     * 
     * Essa classe aqui seria a classe pai com os métodos gerais de mensagem instantânea
     */

    public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
