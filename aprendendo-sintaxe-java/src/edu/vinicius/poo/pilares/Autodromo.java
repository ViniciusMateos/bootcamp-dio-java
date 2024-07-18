package edu.vinicius.poo.pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro impala = new Carro();
        
        impala.setChassi("231123");
        // encapsulamento
        impala.ligar(); // agora o usuario verá apenas que o carro está ligando, mesmo com esse método tendo mais os outros dois de conferir cambio e combustivel


        Moto kawasakininja = new Moto();
        kawasakininja.setChassi("2389102");
        kawasakininja.ligar();

        // abstração e polimorfismo, o "coringa" que herda de "impala" e "impala" que herda de veiculo.
        Veiculo coringa = impala;
            
            coringa.ligar();
    }
}
