package edu.vinicius.poo.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
		//criamos uma pessoa no sistema
        // se tentar apenas criar sem passar os parâmetros definidos pelo construtor dará erro.
		Pessoa marcos = new Pessoa("123", "Marcos");
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	};
}
