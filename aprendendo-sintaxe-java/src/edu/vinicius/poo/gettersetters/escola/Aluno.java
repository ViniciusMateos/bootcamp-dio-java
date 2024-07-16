package edu.vinicius.poo.gettersetters.escola;

public class Aluno {
    /*
     * Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos, de instâncias de classes.
     * 
     * O método Getter, retorna o valor do atributo especificado.
     * O método Setter, define outro novo valor para o atributo especificado.
     * 
     * 
     * convenção Java Beans
     * 
     * - Os atributos precisam ter o modificador de acesso private. 
     * Ex.: private String nome;
     * 
     * - Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos getX e setX, Ex.: getNome() e setNome(String novoNome);
     * 
     * - O método get, é responsável por obter o valor atual do atributo, logo ele precisa ser public, retornar um tipo correspondente ao valor, 
     * Ex.: public String getNome() {};
     * 
     * -  método set, é responsável por definir ou modificar o valor de um atributo em um objeto, logo, ele também precisa ser public
     *  receber um parâmetro do mesmo tipo da variável, mas não retorna nenhum valor void. 
     * Ex.: public void setNome(String newNome);
     * 
     * 
     * Essa convenção existe pelo fato de poder validações de maneira mais fácil dentro do próprio set por exemplo, como condição e algo assim.
     */

    private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}
