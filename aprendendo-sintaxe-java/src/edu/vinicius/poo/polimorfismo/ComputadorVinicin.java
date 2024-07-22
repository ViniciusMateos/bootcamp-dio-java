package edu.vinicius.poo.polimorfismo;


public class ComputadorVinicin {

	/*
	 * Aqui nesse caso de polimorfismo, ele não sabe qualo usuário irá escolher para enviar a mensagem, mas o que ele escolher, ele executará o mesmo método,
	 * porém, com cada classe suas próprias peculiaridades.
	 */

    public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSN();
		else if(appEscolhido.equals("fbm"))
			smi = new Facebook();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
