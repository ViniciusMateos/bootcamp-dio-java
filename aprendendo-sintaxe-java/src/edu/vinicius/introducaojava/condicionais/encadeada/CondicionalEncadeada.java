package edu.vinicius.introducaojava.condicionais.encadeada;

public class CondicionalEncadeada {
    /*
     * Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else), 
     * poderemos ter uma terceira, quarta e ou inúmeras condições. Sendo uma condição encadeada.
     */

     public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado"); 
	else if (nota >= 5 && nota < 7) // (Se não, se) indicando uma nova condição se não for verdadeira.
		System.out.println("Recuperação"); //Diversas condições em seguida da outra
	else
		System.out.println("Reprovado"); 
    }
}
