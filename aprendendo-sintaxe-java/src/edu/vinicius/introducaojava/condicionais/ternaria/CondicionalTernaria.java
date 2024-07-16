package edu.vinicius.introducaojava.condicionais.ternaria;

public class CondicionalTernaria {
    /*
     * Como vimos em operadores, podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador ternário.
     */

     public static void main(String[] args) {
		int nota = 7;

        // Condição composta
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        // Condição encadeada
        int nota2 = 6;
		String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);
        
	}
}
