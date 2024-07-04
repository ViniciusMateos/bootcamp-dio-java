package edu.vinicius.repeticao.breakcontinue;

public class ExemploBreakContinue {

    /*
     * Break significa quebrar, parar, frear, interromper.
     * E é isso que se faz, quando o Java encontra esse comando pela frente. 
     * 
     * Continue, como o nome diz, ele 'continua' o laço.
     */
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }
        //Ele verificará se "numero" é igual a 3, se não for ele exibe o número e continua o laço.
        //Assim que "numero" atingir três ele verificará que é e irá dar um break, nem chegando a exibir o valor
        //Parando a execução exibindo apenas 1 e 2.
    
        System.out.println("Intermediário de FOR's");


        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
        //Aqui mesma coisa que acima
        //Porém quando ele chegar no valor 3 ele continuará normalmente o laço.

        }
}
