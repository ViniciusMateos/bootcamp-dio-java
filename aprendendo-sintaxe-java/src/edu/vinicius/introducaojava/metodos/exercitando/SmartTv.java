package edu.vinicius.introducaojava.metodos.exercitando;

/*
    EXERCITANDO

        Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

        1 - Ela tenha as características: ligada (boolean), canal (int) e volume (int);

        2 - Nossa TV poderá ligar e desligar e assim mudar o estado ligada;

        3- Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;

        4 - Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
*/

public class SmartTv {

    //Passar os atributos que serão necessários para nossa SmartTV
    // 1
    boolean ligada=false;
    int volume = 25;
    int canal = 1;
    

    // DEFINIR AS FUNCIONALIDADES ATRAVÉS DE MÉTODOS

    // 2
    public void ligarTv(){
        ligada = true;
    }
    public void desligarTv(){
        ligada = false;
    }
    //////////////////

    // 3
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    ////////////////////

    //4
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }

}
