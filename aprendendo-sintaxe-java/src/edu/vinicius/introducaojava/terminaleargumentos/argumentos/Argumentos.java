package edu.vinicius.introducaojava.terminaleargumentos.argumentos;

public class Argumentos {

    /*
     * Quando executamos uma classe, que contenha o método main, o mesmo permite que passemos um array [] de argumentos, do tipo String.
     * Logo, podemos após a definição da classe a ser executada, informar estes parâmetros, exemplo:
     * 
     *      java MinhaClasse agumentoUm argumentoDois (EXECUÇÃO ATRAVÉS DO TERMINAL)
     */
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }

    //Passando valores aos argumentos pelo VsCode:
        //Na guia "executar" selecionar "adicionar configuração"
        //Dentro do arquivo "launch.json" localizar a classe e passar os argumentos
        
        //EXEMPLO

        /*
         * "type": "java",
            "name": "Argumentos",
            "request": "launch",
            "mainClass": "edu.vinicius.anatomiaclasses.anatomia_classes.Argumentos",
            "args": ["Vinicius", "Mateos", "19", "1.70"]
         */

    
    //Passando argumentos pelo terminal
        //java MinhaClasse agumentoUm argumentoDois (EXECUÇÃO ATRAVÉS DO TERMINAL)


}
