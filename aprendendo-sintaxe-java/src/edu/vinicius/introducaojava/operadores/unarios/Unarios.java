package edu.vinicius.introducaojava.operadores.unarios;

public class Unarios {
    public static void main(String[] args) {
        /*
            UNÁRIOS

            Esses operadores, são aplicados juntamente com um outro operador aritmético.
            realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

            (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

            (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

            (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

            (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

            (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.
        */

        int numero = 5; 
        numero = -numero; // negou o valor dessa variável

        System.out.println(numero);

        numero = numero * -1; // para fazer com que o número volte a ser positivo.

        System.out.println(numero);

        /////////////////////////

        numero++; //mesma coisa que numero = numero + 1

        System.out.println(numero);

        //////////////////

        System.out.println( -- numero); //com o decremento "--" antes da variável, ele irá executar o decremento e depois exibir
        System.out.println(numero);
        System.out.println(numero ++); //assim como ele irá exibir primeiro e depois realizar o incremento, aparecendo apenas na próxima exibição da váriavel
        System.out.println(numero);

        //////////////////////

        boolean variavel = true;

        System.out.println(!variavel); // "!" nega a operação lógicam tornando-a falsa

        System.out.println(variavel); // porém se exibirmos novamente, mostrará true 

        //para negar de fato a variável terá de re-atribuir o valor dela
        variavel = !variavel;

        System.out.println(variavel);

    }
}
