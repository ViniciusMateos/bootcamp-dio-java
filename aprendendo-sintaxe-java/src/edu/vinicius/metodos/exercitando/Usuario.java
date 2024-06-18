package edu.vinicius.metodos.exercitando;

public class Usuario {
    public static void main(String[] args) {
        
        //Objeto, ser visto mais adiante
        SmartTv smartTv = new SmartTv();

        //MOSTRAR ANTES DAS MANIPULAÇÕES
        System.out.println("A SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        // Ligar e desligar TV

        smartTv.ligarTv(); //LIGANDO
        System.out.println("\nA SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.desligarTv(); //DESLIGANDO
        System.out.println("\nA SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligarTv(); //LIGANDO NOVAMENTE
        System.out.println("\nA SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        /////////////////

        //AUMENTAR E DIMINUIR VOLUME

        smartTv.aumentarVolume();
        smartTv.aumentarVolume(); //AUMENTANDO O VOLUME 2 VEZES
        System.out.println("\nA SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();//DIMINUINDO UMA VEZ O VOLUME
        System.out.println("\nA SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        ///////////////

        //TROCANDO CANAIS

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();//AUMENTANDO O CANAL 3 VEZES
        System.out.println("\nA SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirCanal();//DIMINUINDO O CANAL 1 VEZ
        System.out.println("\nA SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.escolherCanal(14);//TROCANDO O CANAL PASSANDO O PARÂMETRO DE QUAL CANAL ESCOLHIDO (novoCanal)
        System.out.println("\nA SmartTV está ligada? R.: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

    }
}
