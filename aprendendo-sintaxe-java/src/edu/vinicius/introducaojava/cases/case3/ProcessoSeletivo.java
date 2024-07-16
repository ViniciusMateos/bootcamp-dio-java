package edu.vinicius.introducaojava.cases.case3;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice de elemento");

        for(int indice = 0; indice < candidatos.length ; indice++){
            System.out.println("O candidato n° " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Imprimir de maneira abreviada através do FOR EACH");

        for(String candidato : candidatos){
            System.out.println("O candidato escolhido foi: " + candidato);
        }
    }
}
