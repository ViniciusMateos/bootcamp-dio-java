package edu.vinicius.anatomiaclasses.anatomia_classes;

//ANATOMIA DE CLASSES

//Entre "{}" são os blocos de cada classe e métodos.
//(CONVENÇÃO) O nome da classe terá de ter o mesmo nome do arquivo .java

public class MinhaClasse { //(CONVENÇÃO)Todos os arquivos terão o nome com a letra maiúscula e palavras complementares também que nem neste.

    //Se a classe for executável, ela precisa ter um método especial, principal, determinado o método "main"
    public static void main (String [] args){
        //A linguagem é constituida de métodos e classes, nesse caso chamaremos a classe "System"
        //Pediremos uma saída para ela (out), que no caso será de impressão (print)
        // Entre "()" são parâmetros que são exigidos pelos métodos, nesse caso passaremos o parâmetro de texto que será impresso
        System.out.print("Olá, bootcamp DIO");
    }
}
