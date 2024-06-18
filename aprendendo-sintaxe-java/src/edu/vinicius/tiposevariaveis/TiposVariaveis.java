package edu.vinicius.tiposevariaveis;

public class TiposVariaveis{ //(CONVENÇÃO)Todos os arquivos terão o nome com a letra maiúscula e palavras complementares também que nem neste.

    //Se a classe for executável, ela precisa ter um método especial, principal, determinado o método "main"
    public static void main (String [] args){
        
        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.



        //Tipos primitivos
		byte idade2 = 123; // Armazena entre -128 a 127 
		short ano = 2021; // Armazena entre -32.768 a 32.767

        //Se começar com zero terá de trocar o tipo, pois Java não irá considera-lo. Teria que ser String
		int cep = 21070333; // Armazena entre -2.147.483.648 a 2.147.483.647 | 

        //Se começar com zero terá de trocar o tipo, pois Java não irá considera-lo. Teria que ser String
        //Tipo float precisa terminar na atribuição com a letra F no final, sendo Mai ou min.
		long cpf = 98765432109L; // Armazena entre -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807


        //Tipos primitivos que podem contar partes fracionárias (números com vírgula).

        //Tipo float precisa terminar na atribuição com a letra F no final, sendo Mai ou min.
		float pi = 3.14F; // Armazena entre -3,4028E + 38 a 3,4028E + 38

		double salario = 1275.33; // Armazeena entre -1,7976E + 308 a 1,7976E + 308


        //JAVA é fortemente tipada  

        //ANTES DO CAST COM ERRO
        /* 
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroNormal;
        */
	
       //DEPOIS DO CAST
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Cast que pegará o tipo abrangente (nesse caso INT) para o menos abrangente (short), fazendo uma adaptação. Caso aconteça algo inesperado você esteja ciente.


        //VARIÁVEIS X CONSTANTES

        //Para que uma variável nunca troque de valor basta colocar "final" antes da declaração.
        //Por convenção o nome da variável constante deve ser em CAIXA ALTA.
        final double PI = 3.14f;

        //Se tentar alterar essa variável constante ao longo do código, resultará em um erro.


	}
}