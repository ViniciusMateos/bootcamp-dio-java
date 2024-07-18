package edu.vinicius.poo.pilares;

public class Carro extends Veiculo{ // extends simboliza a herança (a classe Carro herda da Veiculo)

    // se o metedo ligar não existir aqui nessa classe que herda de Veiculo, ele dará erro falando que precisa definir esse método abstrato.
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    // ao invés de mostrar pro usuario todas essas partes para ligar o carro, como no exemplo, no encapsulamento elas são feitas apenas dentro da prória classe
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
