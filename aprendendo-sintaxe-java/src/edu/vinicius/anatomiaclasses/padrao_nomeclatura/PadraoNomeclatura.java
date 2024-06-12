package edu.vinicius.anatomiaclasses.padrao_nomeclatura;


public class PadraoNomeclatura {

    //PADRÃO DE NOMECLATURA

        //####################//
            //(CONVEÇÃO)toda variável letra minúscula
            //se for composta,primeira letra da segunda palavra é MAIÚSCULA (camelCase)
            //EXEMPLO:

            int ano = 2024;
            int anoFabricacao = 2024;
        //####################//



        //####################//
            //(CONVENÇÃO)Variáveis que não terão valor alterado sempre serão com letra maiúscula
            //EXEMPLO:

            final int ESTADOS_BRASILEIRO = 27; //final chama um método para que essa variável nunca seja alterada.
        //####################//



        //####################//
            // Declação inválida de variáveis

                //int numero&um = 1; //Os únicos símbolos permitidos são _ e $
                //int 1numero = 1;    //Uma variável não pode começar com númerico
                //int numero um = 1; //Não pode ter espaço no nome da variável
                //int long = 1; //long faz parte das palavras reservadas da linguagem
            
            // Declaração válida de veriáveis
                int numero$um = 1;
                int numero1 = 1;
                int numeroum = 1;
                int longo = 1;
        //####################//
    //
    
}
    
