package edu.vinicius.introducaojava.condicionais.composta;

public class CondicionalComposta {
    /*
     * Algumas vezes, o nosso programa deverá seguir mais de uma jornada de execução, condionado a uma regra de negócio, 
     * este cenário é demoninado Estrutura Condicional Composta.
     */
    public static void main(String[] args) {

        int nota = 6;
        
        if(nota >= 7)
         System.out.println("Aprovado"); // 1° jornada
 
        else
         System.out.println("Reprovado"); // 2° jornada
     }

} 
