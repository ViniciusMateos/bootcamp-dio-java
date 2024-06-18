package edu.vinicius.operadores.ternario;

public class Ternario {
    public static void main(String[] args) {
        /*
            TERNÁRIO

            forma resumida para definir uma condição e escolher por um dentre dois valores.
            como se fosse uma condição IF
            toda a sua estrutura estará escrita numa única linha.
            PORÉM A CONDIÇÃO É BOOLEANO

            O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:

            <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
        */
            int a, b;

            a = 5;
            b = 6;

            /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
            resultado = "verdadeiro";
            else
            resultado = "falso";
            */

            //  MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            // <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
            String resultado = (a==b) ? "verdadeiro" : "falso";

            System.out.println(resultado);

    }
}
