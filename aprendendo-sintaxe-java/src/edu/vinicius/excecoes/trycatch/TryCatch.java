package edu.vinicius.excecoes.trycatch;

import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

    /*
     * A instrução Try permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.
     * A instrução Catch permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.
     * A instrução Finally permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. 
     */


/*     try {
        //  bloco de código conforme esperado
      }
      catch(Exception e) {// precisamos saber qual exceção
        // bloco de código que captura as exceções que podem acontecer
        // em caso de um fluxo não previsto
      }

      O bloco try/catch pode conter um conjunto de catchs, correspondentes a cada exceção prevista em uma funcionalidade do programa.
*/

    public static void main(String[] args) {
        //criando o objeto scanner

        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();   
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Os campos Idade e Altura devem ser numéricos");
        }
        
    }
}
