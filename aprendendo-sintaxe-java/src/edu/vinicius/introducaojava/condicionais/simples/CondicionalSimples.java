package edu.vinicius.introducaojava.condicionais.simples;

public class CondicionalSimples {
    /*
    Estrutura Condicional, possibilita a escolha de um grupo de ações e comportamentos
    a serem executadas, quando determinadas condições são ou não satisfeitas.

    Quando ocorre uma validação de execução de fluxo, somente quando a condição for positiva, 
    consideramos como uma estrutura Simples, exemplo:
    */ 

    // CaixaEletronico.java
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}

