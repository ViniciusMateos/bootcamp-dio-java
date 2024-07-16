package edu.vinicius.poo.visibilidade.lanchonete;

import edu.vinicius.poo.visibilidade.lanchonete.area.cliente.Cliente;
import edu.vinicius.poo.visibilidade.lanchonete.atendimento.Atendente;
import edu.vinicius.poo.visibilidade.lanchonete.atendimento.cozinha.Almoxarife;
import edu.vinicius.poo.visibilidade.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
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
    
     public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação
		//  cozinheiro.lavarIngredientes();
		//  cozinheiro.baterVitaminaLiquidificador();
		//  cozinheiro.selecionarIngredientesVitamina();
		//  cozinheiro.prepararLanche();
		//  cozinheiro.prepararVitamina();
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
        //nem precisa dessa informação
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		//  almoxarife.controlarEntrada();
		//  almoxarife.controlarSaida();

		//ação que somente o seu pacote cozinha precisa conhecer (default)
		// almoxarife.entregarIngredientes(); 
		// almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();

		//  atendente.pegarLancheCozinha();

		atendente.receberPagamento();
		atendente.servindoMesa();

		//ação que somente o seu pacote cozinha precisa conhecer (default)
		// atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
            //cliente.pegarPedidoBalcao();
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		    //cliente.consultarSaldoAplicativo();
		
		//já pensou os clientes ouvindo que o gás acabou ?
		//  cozinheiro.pedirParaTrocarGas(atendente);
		//  cozinheiro.pedirParaTrocarGas(almoxarife);
		
	}

}
