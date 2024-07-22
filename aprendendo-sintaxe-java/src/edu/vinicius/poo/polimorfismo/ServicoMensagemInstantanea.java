package edu.vinicius.poo.polimorfismo;

public abstract class ServicoMensagemInstantanea {

    /*
     * Depois de herdaram da classe pai, as próprias outras classes que tem que dizer como faz tal ação da classe pai,
	 * dai que entra a abstração, que irá fazer com que as classes herdadas sejam obrigadas a dizer como o método herdado deve ser feito em cada classe.
	 * 
	 * NA ABSTRAÇÃO OS MÉTODOS ABSTRATOS NÃO POSSUEM CORPO.
     */

    public abstract void enviarMensagem();
	public abstract void receberMensagem();


    //somente os filhos conhecem este método
    //se não queremos que o usuário saiba do método de validar a internet, pensaria em colocar o método como PRIVATE, porém, assim nem as filhas da classe pai (ServicoMensagemInstantanea) saberiam desse método.
    //Assim, entra o modificador protected, que está ligado com o polimorfismo. Fazendo com que esse método seja visível apenas para as classes filhas da classe herdada.
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }	
}
