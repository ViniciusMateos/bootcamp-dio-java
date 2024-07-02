package edu.vinicius.condicionais.switchcase;

public class SistemaMedida {

    /*
     * A estrutura switch, compara o valor de cada caso, com o da variável sequencialmente
     * e sempre que encontra um valor correspondente, executa o código associado ao caso.
     * 
     * Para evitar que as comparações continuem a ser executadas, após um caso correspondente ter sido encontrado, acrescentamos o comando break no final de cada bloco de códigos. 
     * O comando break, quando executado, encerra a execução da estrutura onde ele se encontra.
     */

    public static void main(String[] args) {
		String sigla = "M";

        // Modo condicional if/else
		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");

        

        // Modo condicional switch / case
        String sigla2 = "M";

		switch (sigla2) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}

        // Observe que a nível de sintaxe, não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma preocupação:
        // informar a palavra break em cada alternativa.
	}
}
