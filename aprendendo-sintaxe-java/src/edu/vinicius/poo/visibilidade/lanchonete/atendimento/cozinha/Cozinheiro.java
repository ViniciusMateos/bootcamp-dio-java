package edu.vinicius.poo.visibilidade.lanchonete.atendimento.cozinha;

import edu.vinicius.poo.visibilidade.lanchonete.atendimento.Atendente;

public class Cozinheiro {
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
     * Modificador default
     * O modificador default está fortemente associado a organização das classes por pacotes, algumas implementações, não precisam estar disponíveis por todo o projeto, 
     * e este modificador de acesso, restringe a visibilidade por pacotes.
     * Ele devinirá o a visibilidade a nível de pacote, ou seja, o pacote que ele se encontra, e as outras classes que estiverem dentro do mesmo poderão visualiza-los.
     * 
     * 
     * 
     * Modificador private
     * Modificador que determina que apenas a classe que o método se encontra seja possível de ver
     */

     //pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}
	//pode ser default
	 public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
	}
	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}

    // Ação indisponivel pelo fato de o cozinheiro pedir para trocar o gás apenas para o Almoxarife como no método abaixo. E não para um Atendente.
	/*
    public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
    */
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
    // mesmo o pedirIngredientes estando default ele consegue ser visualizado por estarem dentro do mesmo pacote.
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}

}
