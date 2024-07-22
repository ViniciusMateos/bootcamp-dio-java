package edu.vinicius.poo.abstracao;

public abstract class ServicoMensagemInstantanea {

    /*
     * Depois de herdaram da classe pai, as próprias outras classes que tem que dizer como faz tal ação da classe pai,
	 * dai que entra a abstração, que irá fazer com que as classes herdadas sejam obrigadas a dizer como o método herdado deve ser feito em cada classe.
	 * 
	 * NA ABSTRAÇÃO OS MÉTODOS ABSTRATOS NÃO POSSUEM CORPO.
     */

    public abstract void enviarMensagem();
	public abstract void receberMensagem();
}
