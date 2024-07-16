package edu.vinicius.introducaojava.repeticao.exemplofor;

public class ExemploFor {
    /*
     * O comando for (na tradução literal para a língua portuguesa “para”)
     * 
     *  permite que uma variável contadora, seja testada e incrementada a cada iteração, 
     * sendo essas informações definidas na chamada do comando.
     * 
     * O comando for recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.
     */

     //EXEMPLO

     //estrutura do controle de fluxo for

    /*  for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
        {
            // comando que será executado até que a 
            // expressão de validação torne-se falsa 
        }
    */

    // Preciso contar 20 carneiros para pegar no sono
    public static void main(String[] args) {
        // for(quantidade de carneirinho inicial; enquanto for menor que 20 carneiros; contar mais um carneiro)
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) { 
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

        // Após o bloco de repetição ele seguirá o fluxo do código normalmente.
        System.out.println("Consegui dormir");

        //OUTRO TIPO DE ESTRUTURA
        //Só importa o bloco condicional, ser for true, executará o que estiver no escopo do FOR
        int carneirinhos2 = 1;
        for( ; carneirinhos2 <=20; ) {
        System.out.println(carneirinhos2 + " - Carneirinho(s)");
        carneirinhos2 ++;
}
	}
}
