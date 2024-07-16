package edu.vinicius.introducaojava.operadores.aritmeticos;

public class Aritmeticos {
    public static void main(String[] args) {
        /*
        ARITMÉTICOS
        
        utilizado para realizar operações matemáticas entre valores numéricos
        Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).

        
    */

    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);

    // ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto
    // , realizará a “concatenação de textos”. (JUNÇÃO DE TEXTO)

    String nomeCompleto = "LINGUAGEM" + "JAVA";
    
    System.out.printf("Concatenação de nome completo é: %s\n", nomeCompleto);

    //qual o resultado das expressoes abaixo?
    String concatenacao ="?";

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao); // valor = 13

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao); // valor = 1111

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao); // valor = 1111

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao); // valor = 1111
    
    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao); // valor = 13

    //Isso ocorre porque ao identificar uma string no meio ("1") ele apartir disso irá concatenar como se todos os valores mesmo que números sejam texto.
    // Exceto para valores em parenteses que ele irá resolver o parantese para assim concatenar como se fosse texto.

    }
    


}
