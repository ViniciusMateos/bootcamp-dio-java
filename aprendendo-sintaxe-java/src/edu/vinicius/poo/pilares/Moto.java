package edu.vinicius.poo.pilares;

public class Moto extends Veiculo{ // extends simboliza herença (a classe Moto herda da Veiculo)

    // se o metedo ligar não existir aqui nessa classe que herda de Veiculo, ele dará erro falando que precisa definir esse método abstrato.
    public void ligar(){
        System.err.println("Moto ligada");
    }
}
