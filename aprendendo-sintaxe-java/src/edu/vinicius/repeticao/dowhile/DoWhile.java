package edu.vinicius.repeticao.dowhile;

import java.util.Random;

public class DoWhile {
    /*
     * O laço do / while (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while,
     *  considera que, enquanto uma determinada condição for válida, o bloco de código será executado.
     * 
     * Entretanto, do / while testa a condição após executar o código, sendo assim, 
     * mesmo que a condição seja considerada inválida, no primeiro teste o bloco será executado pelo menos uma vez.
     */


     //estrutura do controle de fluxo do while

/*  do
    {
        // comando que será executado até que a 
        // expressão de validação torne-se falsa 
    }
    while (expressão booleana de validação);
*/

	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando()); //While irá chamar o método até que ele seja falso
		
		System.out.println("Alô !!!");
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1; //Condição verdadeira é o valor Random cair em 1
		System.out.println("Atendeu? " + atendeu);  //quando "atendeu" der como falso, no retun terá o operador "!" que irá inventer, tornando verdadeira para o while
                                                    // fazendo assim que ele tente discar novamente o telefone, assim que "atendeu" der verdadeira, o "!" retornará falso para o "While" fazendo assim a execução parar e seguir o código.
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}

