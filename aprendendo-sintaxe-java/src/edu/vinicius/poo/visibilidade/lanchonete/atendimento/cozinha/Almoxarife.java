package edu.vinicius.poo.visibilidade.lanchonete.atendimento.cozinha;

public class Almoxarife {
    /*
     * Modificadores
     * 
     * Em Java, utilizamos três palavras reservadas e um conceito default (sem nehuma palavra reservada) para definir os quatro tipo de visibilidade
     * de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes.
     * 
     * Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos, através do contexto em uma lanchonete, que vende lanche natural e suco.
     * 
     * 
     * 
     * Modificador public
     * quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote, poderá visualizar tais recursos.
     * 
     */

    private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	 void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		//...?
        controlarSaida();
	}
	 void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}

}
