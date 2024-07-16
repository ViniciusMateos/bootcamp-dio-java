package edu.vinicius.poo.visibilidade.lanchonete.atendimento;

public class Atendente {
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
    
     public void servindoMesa() {
		//...?
        pegarLancheCozinha();
		System.out.println("SERVINDO A MESA");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	private void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}  

}
