package edu.vinicius.poo.enums;

public enum EstadoBrasileiro {

    /*
     * Enum, é um tipo especial de classe, onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.
     * 
     * Usamos Enum, quando o nosso modelo de negócio contém objetos de mesmo contexto
     *  que já existem de forma pré-estabelecida com a certeza de não haver tanta alteração de valores.
     * 
     * Exemplos:
     * 
     * Grau de Escolaridade: Analfabeto, Fundamental, Médio, Superior;
     * Estado Civil: Solteiro, Casado, Divorciado, Viúvo;
     * Estados Brasileiros: São Paulo, Rio de Janeiro, Piauí, Maranhão.
     * 
     * 
     * Não confunda uma lista de constantes com enum.
     * Enquanto que uma constante é uma variável de tipo com valor imutável, enum é um conjunto de objetos já pre-definidos na aplicação.
     * 
     * Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. 
     * 
     */

    SAO_PAULO ("SP","São Paulo",11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro",12),
	PIAUI ("PI", "Piauí",13),
	MARANHAO ("MA","Maranhão",14), 
    BAHIA ("BA", "Bahia",15)
    ;
	
	private String nome;
	private String sigla;
    private int ibge;
	
    // construtor da enum
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
        this.ibge = ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
    public int getIbge() {
		return ibge;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
