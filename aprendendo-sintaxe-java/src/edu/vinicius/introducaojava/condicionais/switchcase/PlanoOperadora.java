package edu.vinicius.introducaojava.condicionais.switchcase;

public class PlanoOperadora {

    /*
     * BASIC: 100 minutos de ligação;
     * MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
     * TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
     */
    
    public static void main(String[] args) {

        // Modo condicional convencional
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
        // Modo condicional switch/case
        String plano2 = "M"; // M / T

		switch (plano2) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
		
        /*
         * Nesse caso sem usar o break, faz com que ele já adicione as vantagens dos planos a partir do outro.
         * Fazendo com que escreva menos código e sendo mais eficiente do que if/else.
         */
	}
}
