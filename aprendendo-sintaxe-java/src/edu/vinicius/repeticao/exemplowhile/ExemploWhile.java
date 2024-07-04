package edu.vinicius.repeticao.exemplowhile;

import java.util.concurrent.ThreadLocalRandom;


public class ExemploWhile {
    
    /*
     * O laço while (na tradução literal para a língua portuguesa “enquanto”)
     * determina que, enquanto uma condição for válida, o bloco de código será executado.
     */

     //estrutura do controle de fluxo while

/*  while (expressão booleana de validação)
    {
        // comando que será executado até que a 
        // expressão de validação torne-se falsa 
    }
*/

    //Recebi uma mesada de 50 reais e vou gastar tudo em doce.
    //Enquanto a somatória dos valores dos doces que eu comprei não atingir o valor da mesada eu vou comprar mais.
    public static void main(String[] args) {
        double mesada = 50.0;
        int quantidadeDoce = 0;

            while(mesada>0) { //enquanto ainda tiver dinheiro na mesada

                Double valorDoce = valorAleatorio();
                

                // if apenas para que não dê um número negativo no final
                if(valorDoce > mesada)
                    valorDoce = mesada;

                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;

                quantidadeDoce ++;
            }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces e comprou " + quantidadeDoce + " doces");
            
    }

    //método para gerar um número aleatório
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
}
