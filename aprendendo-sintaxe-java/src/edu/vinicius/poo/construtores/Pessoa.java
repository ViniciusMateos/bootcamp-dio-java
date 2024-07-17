package edu.vinicius.poo.construtores;

public class Pessoa {
    private String nome;
	private String cpf;
	private String endereco;

    // método construtor
	// o nome deverá ser igual ao nome da classe

    // aqui é o construtor, que deve ter o mesmo nome da classe
    // aqui para criar uma pessoa, terá de informar o cpf e nome nesse caso.
    // cada parâmetro poderá linkar com os atributos.
    
	public Pessoa (String cpf, String nome) {
        // o "this." serve para difenciar o atributo da classe com o atributo do parametro
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
