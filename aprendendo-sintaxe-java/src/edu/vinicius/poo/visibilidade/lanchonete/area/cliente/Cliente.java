package edu.vinicius.poo.visibilidade.lanchonete.area.cliente;

public class Cliente {
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
    
     public void escolherLanche() {
		System.out.println("ESCOLHENDO O LANCHE");
	}
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	public void pagarConta() {
        // talvez esse consulte o saldo, que apenas ele precisa saber
        consultarSaldoAplicativo();
		System.out.println("PAGANDO A CONTA");
	}
	private void consultarSaldoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}

    // não deveria nem existir pelo fato do atendente já ter um método de servir a mesa. (REFATORAÇÃO)
    /*
    public void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}
    */
}
