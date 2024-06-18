package edu.vinicius.operadores.relacionais;

public class Relacionais {
    public static void main(String[] args) {
    
    /*
        RELACIONAIS

        avaliam a relação entre duas variáveis ou expressões

        == Quando desejamos verificar se uma variável é IGUAL A outra.

        != Quando desejamos verificar se uma variável é DIFERENTE da outra.

        > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

        >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

        < Quando desejamos verificar se uma variável é MENOR QUE outra.

        <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
    */

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    System.out.println("numero1 é igual ao numero2?\nResposta: " + simNao);

    simNao = numero1 != numero2;

    System.out.println("\nnumero1 é diferente de numero2?\nResposta: " + simNao);

    //////////////////////

    //CONDIÇÕES

    if(numero1 < numero2){
        System.out.println("\nEssa coondição é verdadeira");
    }

    ////////////////////////

    /*
        Quando se refere a comparação de conteúdos na linguagem
        devemos ter um certo domínio, de como o Java trata o armazenamento destes valores na memória.
    */

    String nome1 = "Vinicin";
    String nome2 = "Vinicin";

    System.out.println("\nnome1 é igual a nome2?\nResposta: " + (nome1 == nome2));


    String nome3 = new String("Vinicin");

    System.out.println("\nnome1 é igual a nome3?\nResposta: " + (nome1 == nome3));
    //Isso se dá pelo fato de "new String" ser um objeto, diferentemente de String.
    //Para fazer essa comparação de conteúdos, o adequado é usar o "equals"
    
    //Para números é certo usar os relacionais para comparação, mas para objetos é adequado o "equals"

    System.out.println("\nnome1 é igual a nome3?\nResposta: " + (nome1.equals(nome3)));

    





    }
}