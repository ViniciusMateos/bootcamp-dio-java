package edu.vinicius.excecoes.costumizada;

public class FormatarCepExemplo {
    
    public static void main(String[] args) {
        try { //tratando excecao "CepInvalidoException"
            String cepFormatado = formatarCep("23765064");
            System.err.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
