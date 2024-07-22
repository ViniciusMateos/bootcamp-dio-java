package edu.vinicius.poo.encapsulamento;

public class ComputadorVinicin {
    /*
 * Simulação do uso da classe MSNMessenger
 * 
 * Dentro do MSN como usuário, apenas é necessário enviar e receber mensagens, ou seja, nada além disso é relevante para o usuário.
 * 
 * Nesse caso, o sistema valida a conexão antes da mensagem e depois salva no histórico, duas coisas que são irrelevantes para o usuário saber.
 * Portanto, a prática de encapsular é "esconder" do usuário esses métodos, tornando o processo de enviar mensagem um método só para o usuário.
 * Isso é feito tornando os métodos de validar e salvar private, podendo ser visto apenas dentro da sua própria classe.
 * 
 */
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		//msn.validarConectadoInternet(); irrelevantes para o usuário.
		msn.enviarMensagem();
		//msn.salvarHistoricoMensagem(); irrelevantes para o usuário.
		
		msn.receberMensagem();
	}
}
