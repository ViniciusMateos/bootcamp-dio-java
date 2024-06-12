package edu.vinicius.anatomiaclasses.variaveis_metodos;

public class VariaveisMetodos {
    /*DECLARANDO VARIÁVEIS E MÉTODOS

        #################### 
            ESTRUTURA VARIÁVEIS
                Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

            EXEMPLO
                int idade = 23;
            double altura = 1.62;
            Dog spike; //observe que aqui a variável spike não tem valor, é normal
        ####################

        ####################
            ESTRUTURA MÉTODO
                TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

            EXEMPLO
                //int somar (int numeroUm, int numero2)
                //String formatarCep (long cep) //Métodos podem tem retorno com valor diferente dos parâmetros, como nesse ex.
        ####################
    */
    public static void main (String [] args){
        
        String primeiroNome = "Vinicius";
        String segundoNome = "Mateos";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome); //Para diferenciar método de variável, método sempre passará com os parâmetros (entre "()")
        System.out.print(nomeCompleto);
    }

        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome); //"return" palavra reservada para retornar um valor do método
        }
    
} 
        

    

